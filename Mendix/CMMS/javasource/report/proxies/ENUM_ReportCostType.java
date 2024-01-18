// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package report.proxies;

public enum ENUM_ReportCostType
{
	MaterialCost(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "MaterialCost" } }),
	LaborCost(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "LaborCost" } }),
	InvoiceCost(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "InvoiceCost" } }),
	OtherCost(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "OtherCost" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private ENUM_ReportCostType(java.lang.String[][] captionStrings)
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
