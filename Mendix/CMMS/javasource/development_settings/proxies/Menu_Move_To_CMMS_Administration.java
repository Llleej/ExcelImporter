// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package development_settings.proxies;

/**
 * 최초 작성자 : 김동명
 * 최초 작성일 : 2023/09/05
 * 최종 수정자 : 
 * 최종 수정일 :
 * 설명 : Menu 클릭 시 해당하는 페이지를 지정해줄 수 있게 하는 Enum
 * V 0.1 : 최초 작성
 */
public enum Menu_Move_To_CMMS_Administration
{
	CMMS_Administration_User_Management(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "사용자 관리" } }),
	CMMS_Administration_Employee_Management(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "사원 관리" } }),
	CMMS_Administration_Standard_Code_Management(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "기준 코드 관리" } }),
	CMMS_Administration_Plant_Management(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "공장 관리" } }),
	CMMS_Administration_Equipment_Type_Tree(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "설비 분류 관리 (트리)" } }),
	CMMS_Administration_Equipment_Location_Tree(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "설비 위치 관리 (트리)" } }),
	CMMS_Administration_Equipment_Location_Tree_by_Plant(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "공장별 설비 위치 트리" } }),
	CMMS_Administration_Material_Type_Tree(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "자재 분류 관리 (트리)" } }),
	CMMS_Administration_Department_Tree(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "부서 관리 (트리)" } }),
	CMMS_Administration_Customer_Registration(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "거래처 관리" } }),
	CMMS_Administration_Log_History(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "로그 이력" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private Menu_Move_To_CMMS_Administration(java.lang.String[][] captionStrings)
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