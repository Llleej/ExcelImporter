// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cmms_administration.proxies;

/**
 * 최초작성자 : 김동명
 * 최초작성일 : 2023-09-11
 * 최종수정자 :
 * 최종수정일 : 
 * 
 * 설명: Plant 엔터티에서 주간근무일수를 드롭다운으로 설정
 * 
 * v1.0 : 생성
 */
public enum WorkDayPerWeek
{
	_1DayPerWeek(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "1일" } }),
	_2DayPerWeek(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "2일" } }),
	_3DayPerWeek(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "3일" } }),
	_4DayPerWeek(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "4일" } }),
	_5DayPerWeek(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "5일" } }),
	_6DayPerWeek(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "6일" } }),
	_7DayPerWeek(new java.lang.String[][] { new java.lang.String[] { "ko_KR", "7일" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private WorkDayPerWeek(java.lang.String[][] captionStrings)
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
