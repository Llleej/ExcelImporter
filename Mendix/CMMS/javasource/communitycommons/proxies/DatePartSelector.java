// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package communitycommons.proxies;

public enum DatePartSelector
{
	year(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "jaar" }, new java.lang.String[] { "ko_KR", "year" } }),
	month(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "maand" }, new java.lang.String[] { "ko_KR", "month" } }),
	day(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "dag" }, new java.lang.String[] { "ko_KR", "day" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private DatePartSelector(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "ko_KR");
	}

	public java.lang.String getCaption()
	{
		return captions.get("ko_KR");
	}
}
