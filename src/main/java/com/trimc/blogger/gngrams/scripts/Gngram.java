package com.trimc.blogger.gngrams.scripts;


/**
 * 	Purpose:
 * 	
 *
 */
public class Gngram {

	private String		gram1;

	private String		gram2;

	private String		gram3;

	/**
	 *	Purpose:
	 *	The number of times the n-Gram was found (across the entire collection)
	 */
	private Double		matchCount;

	/**
	 *	Purpose:
	 *	The ngram type 
	 *
	 *	eg. unigram, bigram, trigram, etc
	 */
	private NgramType	ngramType;

	private String		term;

	/**
	 *	Purpose:
	 *	The number of volumes the n-Gram was found in
	 */
	private Double		volumeCount;

	public String getGram1() {
		return gram1;
	}

	public String getGram2() {
		return gram2;
	}

	public String getGram3() {
		return gram3;
	}

	public Double getMatchCount() {
		return matchCount;
	}

	public NgramType getNgramType() {
		return ngramType;
	}

	public String getTerm() {
		return term;
	}

	public Double getVolumeCount() {
		return volumeCount;
	}

	public void setGram1(String gram1) {
		this.gram1 = gram1;
	}

	public void setGram2(String gram2) {
		this.gram2 = gram2;
	}

	public void setGram3(String gram3) {
		this.gram3 = gram3;
	}

	public void setMatchCount(Double matchCount) {
		this.matchCount = matchCount;
	}

	public void setNgramType(NgramType ngramType) {
		this.ngramType = ngramType;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public void setVolumeCount(Double volumeCount) {
		this.volumeCount = volumeCount;
	}
}
