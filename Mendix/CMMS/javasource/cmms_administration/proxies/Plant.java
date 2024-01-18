// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package cmms_administration.proxies;

/**
 * 최초 작성자 : 이단비
 * 최초 작성일 : 2023/08/30
 * 최종 수정자 : 이단비
 * 최종 수정일 : 2023/10/06
 * 설명 : 공장 정보를 담는 엔터티이며 공장 트리를 구성
 * Version 1.1 : 엔터티 권한 설정 (Admin & Developer 권한 RW , 나머지 권한 R) // 이단비 
 * Version 1.0 : 생성
 */
public class Plant implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject plantMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "CMMS_Administration.Plant";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PlantSequence("PlantSequence"),
		PlantCode("PlantCode"),
		TreeActive("TreeActive"),
		PlantName("PlantName"),
		PlantNameEnglish("PlantNameEnglish"),
		PlantStartDate("PlantStartDate"),
		PlantAnalyzeStartDate("PlantAnalyzeStartDate"),
		PlantWorkDayPerWeek("PlantWorkDayPerWeek"),
		UseTPM("UseTPM"),
		UseOilFueling("UseOilFueling"),
		DayRunTime("DayRunTime"),
		IsPlantActive("IsPlantActive"),
		PlantDescription("PlantDescription"),
		CheckManagement_StandardCode("CMMS_Administration.CheckManagement_StandardCode"),
		WorkManagement_StandardCode("CMMS_Administration.WorkManagement_StandardCode"),
		PlantOffDay_StandardCode("CMMS_Administration.PlantOffDay_StandardCode"),
		PlantCurrency_StandardCode("CMMS_Administration.PlantCurrency_StandardCode");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Plant(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Plant(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject plantMendixObject)
	{
		if (plantMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, plantMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.plantMendixObject = plantMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static cmms_administration.proxies.Plant initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new cmms_administration.proxies.Plant(context, mendixObject);
	}

	public static cmms_administration.proxies.Plant load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return cmms_administration.proxies.Plant.initialize(context, mendixObject);
	}

	public static java.util.List<cmms_administration.proxies.Plant> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> cmms_administration.proxies.Plant.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of PlantSequence
	 */
	public final java.lang.Integer getPlantSequence()
	{
		return getPlantSequence(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantSequence
	 */
	public final java.lang.Integer getPlantSequence(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.PlantSequence.toString());
	}

	/**
	 * Set value of PlantSequence
	 * @param plantsequence
	 */
	public final void setPlantSequence(java.lang.Integer plantsequence)
	{
		setPlantSequence(getContext(), plantsequence);
	}

	/**
	 * Set value of PlantSequence
	 * @param context
	 * @param plantsequence
	 */
	public final void setPlantSequence(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer plantsequence)
	{
		getMendixObject().setValue(context, MemberNames.PlantSequence.toString(), plantsequence);
	}

	/**
	 * @return value of PlantCode
	 */
	public final java.lang.String getPlantCode()
	{
		return getPlantCode(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantCode
	 */
	public final java.lang.String getPlantCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PlantCode.toString());
	}

	/**
	 * Set value of PlantCode
	 * @param plantcode
	 */
	public final void setPlantCode(java.lang.String plantcode)
	{
		setPlantCode(getContext(), plantcode);
	}

	/**
	 * Set value of PlantCode
	 * @param context
	 * @param plantcode
	 */
	public final void setPlantCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String plantcode)
	{
		getMendixObject().setValue(context, MemberNames.PlantCode.toString(), plantcode);
	}

	/**
	 * @return value of TreeActive
	 */
	public final java.lang.Boolean getTreeActive()
	{
		return getTreeActive(getContext());
	}

	/**
	 * @param context
	 * @return value of TreeActive
	 */
	public final java.lang.Boolean getTreeActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.TreeActive.toString());
	}

	/**
	 * Set value of TreeActive
	 * @param treeactive
	 */
	public final void setTreeActive(java.lang.Boolean treeactive)
	{
		setTreeActive(getContext(), treeactive);
	}

	/**
	 * Set value of TreeActive
	 * @param context
	 * @param treeactive
	 */
	public final void setTreeActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean treeactive)
	{
		getMendixObject().setValue(context, MemberNames.TreeActive.toString(), treeactive);
	}

	/**
	 * @return value of PlantName
	 */
	public final java.lang.String getPlantName()
	{
		return getPlantName(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantName
	 */
	public final java.lang.String getPlantName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PlantName.toString());
	}

	/**
	 * Set value of PlantName
	 * @param plantname
	 */
	public final void setPlantName(java.lang.String plantname)
	{
		setPlantName(getContext(), plantname);
	}

	/**
	 * Set value of PlantName
	 * @param context
	 * @param plantname
	 */
	public final void setPlantName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String plantname)
	{
		getMendixObject().setValue(context, MemberNames.PlantName.toString(), plantname);
	}

	/**
	 * @return value of PlantNameEnglish
	 */
	public final java.lang.String getPlantNameEnglish()
	{
		return getPlantNameEnglish(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantNameEnglish
	 */
	public final java.lang.String getPlantNameEnglish(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PlantNameEnglish.toString());
	}

	/**
	 * Set value of PlantNameEnglish
	 * @param plantnameenglish
	 */
	public final void setPlantNameEnglish(java.lang.String plantnameenglish)
	{
		setPlantNameEnglish(getContext(), plantnameenglish);
	}

	/**
	 * Set value of PlantNameEnglish
	 * @param context
	 * @param plantnameenglish
	 */
	public final void setPlantNameEnglish(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String plantnameenglish)
	{
		getMendixObject().setValue(context, MemberNames.PlantNameEnglish.toString(), plantnameenglish);
	}

	/**
	 * @return value of PlantStartDate
	 */
	public final java.util.Date getPlantStartDate()
	{
		return getPlantStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantStartDate
	 */
	public final java.util.Date getPlantStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.PlantStartDate.toString());
	}

	/**
	 * Set value of PlantStartDate
	 * @param plantstartdate
	 */
	public final void setPlantStartDate(java.util.Date plantstartdate)
	{
		setPlantStartDate(getContext(), plantstartdate);
	}

	/**
	 * Set value of PlantStartDate
	 * @param context
	 * @param plantstartdate
	 */
	public final void setPlantStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date plantstartdate)
	{
		getMendixObject().setValue(context, MemberNames.PlantStartDate.toString(), plantstartdate);
	}

	/**
	 * @return value of PlantAnalyzeStartDate
	 */
	public final java.util.Date getPlantAnalyzeStartDate()
	{
		return getPlantAnalyzeStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantAnalyzeStartDate
	 */
	public final java.util.Date getPlantAnalyzeStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.PlantAnalyzeStartDate.toString());
	}

	/**
	 * Set value of PlantAnalyzeStartDate
	 * @param plantanalyzestartdate
	 */
	public final void setPlantAnalyzeStartDate(java.util.Date plantanalyzestartdate)
	{
		setPlantAnalyzeStartDate(getContext(), plantanalyzestartdate);
	}

	/**
	 * Set value of PlantAnalyzeStartDate
	 * @param context
	 * @param plantanalyzestartdate
	 */
	public final void setPlantAnalyzeStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date plantanalyzestartdate)
	{
		getMendixObject().setValue(context, MemberNames.PlantAnalyzeStartDate.toString(), plantanalyzestartdate);
	}

	/**
	 * Get value of PlantWorkDayPerWeek
	 * @param plantworkdayperweek
	 */
	public final cmms_administration.proxies.WorkDayPerWeek getPlantWorkDayPerWeek()
	{
		return getPlantWorkDayPerWeek(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantWorkDayPerWeek
	 */
	public final cmms_administration.proxies.WorkDayPerWeek getPlantWorkDayPerWeek(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.PlantWorkDayPerWeek.toString());
		if (obj == null) {
			return null;
		}
		return cmms_administration.proxies.WorkDayPerWeek.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of PlantWorkDayPerWeek
	 * @param plantworkdayperweek
	 */
	public final void setPlantWorkDayPerWeek(cmms_administration.proxies.WorkDayPerWeek plantworkdayperweek)
	{
		setPlantWorkDayPerWeek(getContext(), plantworkdayperweek);
	}

	/**
	 * Set value of PlantWorkDayPerWeek
	 * @param context
	 * @param plantworkdayperweek
	 */
	public final void setPlantWorkDayPerWeek(com.mendix.systemwideinterfaces.core.IContext context, cmms_administration.proxies.WorkDayPerWeek plantworkdayperweek)
	{
		if (plantworkdayperweek != null) {
			getMendixObject().setValue(context, MemberNames.PlantWorkDayPerWeek.toString(), plantworkdayperweek.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.PlantWorkDayPerWeek.toString(), null);
		}
	}

	/**
	 * @return value of UseTPM
	 */
	public final java.lang.Boolean getUseTPM()
	{
		return getUseTPM(getContext());
	}

	/**
	 * @param context
	 * @return value of UseTPM
	 */
	public final java.lang.Boolean getUseTPM(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseTPM.toString());
	}

	/**
	 * Set value of UseTPM
	 * @param usetpm
	 */
	public final void setUseTPM(java.lang.Boolean usetpm)
	{
		setUseTPM(getContext(), usetpm);
	}

	/**
	 * Set value of UseTPM
	 * @param context
	 * @param usetpm
	 */
	public final void setUseTPM(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usetpm)
	{
		getMendixObject().setValue(context, MemberNames.UseTPM.toString(), usetpm);
	}

	/**
	 * @return value of UseOilFueling
	 */
	public final java.lang.Boolean getUseOilFueling()
	{
		return getUseOilFueling(getContext());
	}

	/**
	 * @param context
	 * @return value of UseOilFueling
	 */
	public final java.lang.Boolean getUseOilFueling(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseOilFueling.toString());
	}

	/**
	 * Set value of UseOilFueling
	 * @param useoilfueling
	 */
	public final void setUseOilFueling(java.lang.Boolean useoilfueling)
	{
		setUseOilFueling(getContext(), useoilfueling);
	}

	/**
	 * Set value of UseOilFueling
	 * @param context
	 * @param useoilfueling
	 */
	public final void setUseOilFueling(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean useoilfueling)
	{
		getMendixObject().setValue(context, MemberNames.UseOilFueling.toString(), useoilfueling);
	}

	/**
	 * @return value of DayRunTime
	 */
	public final java.lang.Integer getDayRunTime()
	{
		return getDayRunTime(getContext());
	}

	/**
	 * @param context
	 * @return value of DayRunTime
	 */
	public final java.lang.Integer getDayRunTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.DayRunTime.toString());
	}

	/**
	 * Set value of DayRunTime
	 * @param dayruntime
	 */
	public final void setDayRunTime(java.lang.Integer dayruntime)
	{
		setDayRunTime(getContext(), dayruntime);
	}

	/**
	 * Set value of DayRunTime
	 * @param context
	 * @param dayruntime
	 */
	public final void setDayRunTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer dayruntime)
	{
		getMendixObject().setValue(context, MemberNames.DayRunTime.toString(), dayruntime);
	}

	/**
	 * @return value of IsPlantActive
	 */
	public final java.lang.Boolean getIsPlantActive()
	{
		return getIsPlantActive(getContext());
	}

	/**
	 * @param context
	 * @return value of IsPlantActive
	 */
	public final java.lang.Boolean getIsPlantActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsPlantActive.toString());
	}

	/**
	 * Set value of IsPlantActive
	 * @param isplantactive
	 */
	public final void setIsPlantActive(java.lang.Boolean isplantactive)
	{
		setIsPlantActive(getContext(), isplantactive);
	}

	/**
	 * Set value of IsPlantActive
	 * @param context
	 * @param isplantactive
	 */
	public final void setIsPlantActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isplantactive)
	{
		getMendixObject().setValue(context, MemberNames.IsPlantActive.toString(), isplantactive);
	}

	/**
	 * @return value of PlantDescription
	 */
	public final java.lang.String getPlantDescription()
	{
		return getPlantDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantDescription
	 */
	public final java.lang.String getPlantDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PlantDescription.toString());
	}

	/**
	 * Set value of PlantDescription
	 * @param plantdescription
	 */
	public final void setPlantDescription(java.lang.String plantdescription)
	{
		setPlantDescription(getContext(), plantdescription);
	}

	/**
	 * Set value of PlantDescription
	 * @param context
	 * @param plantdescription
	 */
	public final void setPlantDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String plantdescription)
	{
		getMendixObject().setValue(context, MemberNames.PlantDescription.toString(), plantdescription);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of CheckManagement_StandardCode
	 */
	public final commons.proxies.StandardCode getCheckManagement_StandardCode() throws com.mendix.core.CoreException
	{
		return getCheckManagement_StandardCode(getContext());
	}

	/**
	 * @param context
	 * @return value of CheckManagement_StandardCode
	 * @throws com.mendix.core.CoreException
	 */
	public final commons.proxies.StandardCode getCheckManagement_StandardCode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		commons.proxies.StandardCode result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CheckManagement_StandardCode.toString());
		if (identifier != null) {
			result = commons.proxies.StandardCode.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of CheckManagement_StandardCode
	 * @param checkmanagement_standardcode
	 */
	public final void setCheckManagement_StandardCode(commons.proxies.StandardCode checkmanagement_standardcode)
	{
		setCheckManagement_StandardCode(getContext(), checkmanagement_standardcode);
	}

	/**
	 * Set value of CheckManagement_StandardCode
	 * @param context
	 * @param checkmanagement_standardcode
	 */
	public final void setCheckManagement_StandardCode(com.mendix.systemwideinterfaces.core.IContext context, commons.proxies.StandardCode checkmanagement_standardcode)
	{
		if (checkmanagement_standardcode == null) {
			getMendixObject().setValue(context, MemberNames.CheckManagement_StandardCode.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.CheckManagement_StandardCode.toString(), checkmanagement_standardcode.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkManagement_StandardCode
	 */
	public final commons.proxies.StandardCode getWorkManagement_StandardCode() throws com.mendix.core.CoreException
	{
		return getWorkManagement_StandardCode(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkManagement_StandardCode
	 * @throws com.mendix.core.CoreException
	 */
	public final commons.proxies.StandardCode getWorkManagement_StandardCode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		commons.proxies.StandardCode result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkManagement_StandardCode.toString());
		if (identifier != null) {
			result = commons.proxies.StandardCode.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkManagement_StandardCode
	 * @param workmanagement_standardcode
	 */
	public final void setWorkManagement_StandardCode(commons.proxies.StandardCode workmanagement_standardcode)
	{
		setWorkManagement_StandardCode(getContext(), workmanagement_standardcode);
	}

	/**
	 * Set value of WorkManagement_StandardCode
	 * @param context
	 * @param workmanagement_standardcode
	 */
	public final void setWorkManagement_StandardCode(com.mendix.systemwideinterfaces.core.IContext context, commons.proxies.StandardCode workmanagement_standardcode)
	{
		if (workmanagement_standardcode == null) {
			getMendixObject().setValue(context, MemberNames.WorkManagement_StandardCode.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkManagement_StandardCode.toString(), workmanagement_standardcode.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of PlantOffDay_StandardCode
	 */
	public final commons.proxies.StandardCode getPlantOffDay_StandardCode() throws com.mendix.core.CoreException
	{
		return getPlantOffDay_StandardCode(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantOffDay_StandardCode
	 * @throws com.mendix.core.CoreException
	 */
	public final commons.proxies.StandardCode getPlantOffDay_StandardCode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		commons.proxies.StandardCode result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PlantOffDay_StandardCode.toString());
		if (identifier != null) {
			result = commons.proxies.StandardCode.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of PlantOffDay_StandardCode
	 * @param plantoffday_standardcode
	 */
	public final void setPlantOffDay_StandardCode(commons.proxies.StandardCode plantoffday_standardcode)
	{
		setPlantOffDay_StandardCode(getContext(), plantoffday_standardcode);
	}

	/**
	 * Set value of PlantOffDay_StandardCode
	 * @param context
	 * @param plantoffday_standardcode
	 */
	public final void setPlantOffDay_StandardCode(com.mendix.systemwideinterfaces.core.IContext context, commons.proxies.StandardCode plantoffday_standardcode)
	{
		if (plantoffday_standardcode == null) {
			getMendixObject().setValue(context, MemberNames.PlantOffDay_StandardCode.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.PlantOffDay_StandardCode.toString(), plantoffday_standardcode.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of PlantCurrency_StandardCode
	 */
	public final commons.proxies.StandardCode getPlantCurrency_StandardCode() throws com.mendix.core.CoreException
	{
		return getPlantCurrency_StandardCode(getContext());
	}

	/**
	 * @param context
	 * @return value of PlantCurrency_StandardCode
	 * @throws com.mendix.core.CoreException
	 */
	public final commons.proxies.StandardCode getPlantCurrency_StandardCode(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		commons.proxies.StandardCode result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PlantCurrency_StandardCode.toString());
		if (identifier != null) {
			result = commons.proxies.StandardCode.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of PlantCurrency_StandardCode
	 * @param plantcurrency_standardcode
	 */
	public final void setPlantCurrency_StandardCode(commons.proxies.StandardCode plantcurrency_standardcode)
	{
		setPlantCurrency_StandardCode(getContext(), plantcurrency_standardcode);
	}

	/**
	 * Set value of PlantCurrency_StandardCode
	 * @param context
	 * @param plantcurrency_standardcode
	 */
	public final void setPlantCurrency_StandardCode(com.mendix.systemwideinterfaces.core.IContext context, commons.proxies.StandardCode plantcurrency_standardcode)
	{
		if (plantcurrency_standardcode == null) {
			getMendixObject().setValue(context, MemberNames.PlantCurrency_StandardCode.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.PlantCurrency_StandardCode.toString(), plantcurrency_standardcode.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return plantMendixObject;
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final cmms_administration.proxies.Plant that = (cmms_administration.proxies.Plant) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
