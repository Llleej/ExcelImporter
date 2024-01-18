// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package equipment_management.proxies;

/**
 * 최초작성자 : 김동명
 * 최초작성일 : 2023/11/16
 * 
 * 설명 : 설비마스터에서 메뉴 선택을 위한 헬퍼용 ENUM
 * 
 * V1.0 : 최초작성
 */
public enum ENU_Equipment_Master_Type
{
	List(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "목록" } }),
	Detail(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "상세정보" } }),
	EDM(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "전자문서" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private ENU_Equipment_Master_Type(java.lang.String[][] captionStrings)
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