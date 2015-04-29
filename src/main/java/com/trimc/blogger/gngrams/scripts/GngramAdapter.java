package com.trimc.blogger.gngrams.scripts;

import com.trimc.blogger.commons.exception.AdapterValidationException;
import com.trimc.blogger.commons.utils.StringUtils;
import com.trimc.blogger.commons.utils.TextUtils;

public final class GngramAdapter {

	public static boolean isAlphaOnly(Gngram gngram) {
		if (!TextUtils.isAlphaOnly(gngram.getGram1())) return false;
		if (!TextUtils.isAlphaOnly(gngram.getGram2())) return false;
		if (!TextUtils.isAlphaOnly(gngram.getGram3())) return false;
		return true;
	}

	public static Gngram transform(String line) throws AdapterValidationException {
		Gngram gngram = new Gngram();

		/*	expected file format:
		 * 	Facilities_NOUN by_ADP Type_NOUN	1970	2	2
		 */

		String[] tokens = StringUtils.split(line, "\t");
		if (4 != tokens.length) throw new AdapterValidationException("Tab-Delimited Line of 4 Columns Expected (actual-columns = %s)", tokens.length);

		String term = tokens[0];

		StringBuilder sb = new StringBuilder();
		NgramType ngramType = null;

		String[] grams = StringUtils.split(term, " ");
		if (grams.length > 0) {
			gngram.setGram1(cleanse(grams[0]));
			sb.append(gngram.getGram1());
			ngramType = NgramType.UNIGRAM;
		}

		if (grams.length > 1) {
			gngram.setGram2(cleanse(grams[1]));
			sb.append(" " + gngram.getGram2());
			ngramType = NgramType.BIGRAM;
		}

		if (grams.length > 2) {
			gngram.setGram3(cleanse(grams[2]));
			sb.append(" " + gngram.getGram3());
			ngramType = NgramType.TRIGRAM;
		}

		gngram.setTerm(StringUtils.trim(sb.toString()));
		gngram.setNgramType(ngramType);

		gngram.setVolumeCount(Double.parseDouble(tokens[2]));
		gngram.setMatchCount(Double.parseDouble(tokens[3]));

		return gngram;
	}

	private static String cleanse(String term) {
		term = term.toLowerCase();
		if (term.contains("_")) return StringUtils.substringBefore(term, "_");
		return term.trim();
	}

}
