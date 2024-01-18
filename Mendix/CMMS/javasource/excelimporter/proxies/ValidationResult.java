// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

public enum ValidationResult
{
	UnUsed(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "Ongebruikt" }, new java.lang.String[] { "en_GB", "UnUsed" }, new java.lang.String[] { "en_ZA", "UnUsed" }, new java.lang.String[] { "ko_KR", "UnUsed" } }),
	ValidAttribute(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "Geldig attribuut" }, new java.lang.String[] { "en_GB", "ValidAttribute" }, new java.lang.String[] { "en_ZA", "ValidAttribute" }, new java.lang.String[] { "ko_KR", "ValidAttribute" } }),
	ValidReference(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "Geldige referentie" }, new java.lang.String[] { "en_GB", "ValidReference" }, new java.lang.String[] { "en_ZA", "ValidReference" }, new java.lang.String[] { "ko_KR", "ValidReference" } }),
	NoReferenceSelected(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "NoReferenceSelected" }, new java.lang.String[] { "en_GB", "NoReferenceSelected" }, new java.lang.String[] { "en_ZA", "NoReferenceSelected" }, new java.lang.String[] { "ko_KR", "NoReferenceSelected" } }),
	NoReferencedObjectSelected(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "NoReferencedObjectSelected" }, new java.lang.String[] { "en_GB", "NoReferencedObjectSelected" }, new java.lang.String[] { "en_ZA", "NoReferencedObjectSelected" }, new java.lang.String[] { "ko_KR", "NoReferencedObjectSelected" } }),
	NoAttributeSelected(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "NoAttributeSelected" }, new java.lang.String[] { "en_GB", "NoAttributeSelected" }, new java.lang.String[] { "en_ZA", "NoAttributeSelected" }, new java.lang.String[] { "ko_KR", "NoAttributeSelected" } }),
	InvalidAttribute(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "Ongeldig attribuut" }, new java.lang.String[] { "en_GB", "InvalidAttribute" }, new java.lang.String[] { "en_ZA", "InvalidAttribute" }, new java.lang.String[] { "ko_KR", "InvalidAttribute" } }),
	InvalidReference(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "Ongeldige referentie" }, new java.lang.String[] { "en_GB", "InvalidReference" }, new java.lang.String[] { "en_ZA", "InvalidReference" }, new java.lang.String[] { "ko_KR", "InvalidReference" } }),
	InvalidReferencedObject(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "Ongeldig gerefereerd object" }, new java.lang.String[] { "en_GB", "InvalidReferencedObject" }, new java.lang.String[] { "en_ZA", "InvalidReferencedObject" }, new java.lang.String[] { "ko_KR", "InvalidReferencedObject" } }),
	NoAssociationKeys(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "Geen sleutel kolommen voor de associatie" }, new java.lang.String[] { "en_GB", "No key columns for the association" }, new java.lang.String[] { "en_ZA", "No key columns for the association" }, new java.lang.String[] { "ko_KR", "No key columns for the association" } }),
	InvalidAutoNumberSelection(new java.lang.String[][] { new java.lang.String[] { "nl_NL", "InvalidAutoNumberSelection" }, new java.lang.String[] { "en_GB", "InvalidAutoNumberSelection" }, new java.lang.String[] { "en_ZA", "InvalidAutoNumberSelection" }, new java.lang.String[] { "ko_KR", "InvalidAutoNumberSelection" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private ValidationResult(java.lang.String[][] captionStrings)
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
