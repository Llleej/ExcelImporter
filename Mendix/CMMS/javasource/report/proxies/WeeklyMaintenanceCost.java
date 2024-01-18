// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package report.proxies;

/**
 * 최초 작성자 : 이단비
 * 최초 작성일 : 2023/10/29
 * 최종 수정자 : 
 * 최종 수정일 : 2023/10/29
 * 설명 : 1주 기준 보전 비용 집계를 담는 엔터티 
 * Version 1.0 : 생성
 */
public class WeeklyMaintenanceCost implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject weeklyMaintenanceCostMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Report.WeeklyMaintenanceCost";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Week("Week"),
		Plant("Plant"),
		Location("Location"),
		Equipment("Equipment"),
		EquipmentType("EquipmentType"),
		Cost("Cost"),
		ReportCostType("ReportCostType");

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

	public WeeklyMaintenanceCost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WeeklyMaintenanceCost(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject weeklyMaintenanceCostMendixObject)
	{
		if (weeklyMaintenanceCostMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, weeklyMaintenanceCostMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.weeklyMaintenanceCostMendixObject = weeklyMaintenanceCostMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static report.proxies.WeeklyMaintenanceCost initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new report.proxies.WeeklyMaintenanceCost(context, mendixObject);
	}

	public static report.proxies.WeeklyMaintenanceCost load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return report.proxies.WeeklyMaintenanceCost.initialize(context, mendixObject);
	}

	public static java.util.List<report.proxies.WeeklyMaintenanceCost> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> report.proxies.WeeklyMaintenanceCost.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Week
	 */
	public final java.util.Date getWeek()
	{
		return getWeek(getContext());
	}

	/**
	 * @param context
	 * @return value of Week
	 */
	public final java.util.Date getWeek(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Week.toString());
	}

	/**
	 * Set value of Week
	 * @param week
	 */
	public final void setWeek(java.util.Date week)
	{
		setWeek(getContext(), week);
	}

	/**
	 * Set value of Week
	 * @param context
	 * @param week
	 */
	public final void setWeek(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date week)
	{
		getMendixObject().setValue(context, MemberNames.Week.toString(), week);
	}

	/**
	 * @return value of Plant
	 */
	public final java.lang.String getPlant()
	{
		return getPlant(getContext());
	}

	/**
	 * @param context
	 * @return value of Plant
	 */
	public final java.lang.String getPlant(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Plant.toString());
	}

	/**
	 * Set value of Plant
	 * @param plant
	 */
	public final void setPlant(java.lang.String plant)
	{
		setPlant(getContext(), plant);
	}

	/**
	 * Set value of Plant
	 * @param context
	 * @param plant
	 */
	public final void setPlant(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String plant)
	{
		getMendixObject().setValue(context, MemberNames.Plant.toString(), plant);
	}

	/**
	 * @return value of Location
	 */
	public final java.lang.String getLocation()
	{
		return getLocation(getContext());
	}

	/**
	 * @param context
	 * @return value of Location
	 */
	public final java.lang.String getLocation(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Location.toString());
	}

	/**
	 * Set value of Location
	 * @param location
	 */
	public final void setLocation(java.lang.String location)
	{
		setLocation(getContext(), location);
	}

	/**
	 * Set value of Location
	 * @param context
	 * @param location
	 */
	public final void setLocation(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String location)
	{
		getMendixObject().setValue(context, MemberNames.Location.toString(), location);
	}

	/**
	 * @return value of Equipment
	 */
	public final java.lang.String getEquipment()
	{
		return getEquipment(getContext());
	}

	/**
	 * @param context
	 * @return value of Equipment
	 */
	public final java.lang.String getEquipment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Equipment.toString());
	}

	/**
	 * Set value of Equipment
	 * @param equipment
	 */
	public final void setEquipment(java.lang.String equipment)
	{
		setEquipment(getContext(), equipment);
	}

	/**
	 * Set value of Equipment
	 * @param context
	 * @param equipment
	 */
	public final void setEquipment(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String equipment)
	{
		getMendixObject().setValue(context, MemberNames.Equipment.toString(), equipment);
	}

	/**
	 * @return value of EquipmentType
	 */
	public final java.lang.String getEquipmentType()
	{
		return getEquipmentType(getContext());
	}

	/**
	 * @param context
	 * @return value of EquipmentType
	 */
	public final java.lang.String getEquipmentType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EquipmentType.toString());
	}

	/**
	 * Set value of EquipmentType
	 * @param equipmenttype
	 */
	public final void setEquipmentType(java.lang.String equipmenttype)
	{
		setEquipmentType(getContext(), equipmenttype);
	}

	/**
	 * Set value of EquipmentType
	 * @param context
	 * @param equipmenttype
	 */
	public final void setEquipmentType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String equipmenttype)
	{
		getMendixObject().setValue(context, MemberNames.EquipmentType.toString(), equipmenttype);
	}

	/**
	 * @return value of Cost
	 */
	public final java.math.BigDecimal getCost()
	{
		return getCost(getContext());
	}

	/**
	 * @param context
	 * @return value of Cost
	 */
	public final java.math.BigDecimal getCost(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Cost.toString());
	}

	/**
	 * Set value of Cost
	 * @param cost
	 */
	public final void setCost(java.math.BigDecimal cost)
	{
		setCost(getContext(), cost);
	}

	/**
	 * Set value of Cost
	 * @param context
	 * @param cost
	 */
	public final void setCost(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal cost)
	{
		getMendixObject().setValue(context, MemberNames.Cost.toString(), cost);
	}

	/**
	 * Get value of ReportCostType
	 * @param reportcosttype
	 */
	public final report.proxies.ENUM_ReportCostType getReportCostType()
	{
		return getReportCostType(getContext());
	}

	/**
	 * @param context
	 * @return value of ReportCostType
	 */
	public final report.proxies.ENUM_ReportCostType getReportCostType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ReportCostType.toString());
		if (obj == null) {
			return null;
		}
		return report.proxies.ENUM_ReportCostType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ReportCostType
	 * @param reportcosttype
	 */
	public final void setReportCostType(report.proxies.ENUM_ReportCostType reportcosttype)
	{
		setReportCostType(getContext(), reportcosttype);
	}

	/**
	 * Set value of ReportCostType
	 * @param context
	 * @param reportcosttype
	 */
	public final void setReportCostType(com.mendix.systemwideinterfaces.core.IContext context, report.proxies.ENUM_ReportCostType reportcosttype)
	{
		if (reportcosttype != null) {
			getMendixObject().setValue(context, MemberNames.ReportCostType.toString(), reportcosttype.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.ReportCostType.toString(), null);
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return weeklyMaintenanceCostMendixObject;
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
			final report.proxies.WeeklyMaintenanceCost that = (report.proxies.WeeklyMaintenanceCost) obj;
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
