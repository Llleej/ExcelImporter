// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package monitoring.proxies;

/**
 * 최초 작성자 : 이단비
 * 최초 작성일 : 2023/10/05
 * 최종 수정자 : 
 * 최종 수정일 : 2023/10/05
 * 설명 : 센서 정보를 담는 엔터티
 * Version 1.0 : 생성
 */
public class PowerRealTimeData implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject powerRealTimeDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Monitoring.PowerRealTimeData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ActivePower("ActivePower"),
		MaxPower("MaxPower"),
		TimeStamp("TimeStamp"),
		PowerFactor("PowerFactor"),
		PowerUsage("PowerUsage"),
		PowerRealTimeData_Equipment("Monitoring.PowerRealTimeData_Equipment");

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

	public PowerRealTimeData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected PowerRealTimeData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject powerRealTimeDataMendixObject)
	{
		if (powerRealTimeDataMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, powerRealTimeDataMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.powerRealTimeDataMendixObject = powerRealTimeDataMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static monitoring.proxies.PowerRealTimeData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new monitoring.proxies.PowerRealTimeData(context, mendixObject);
	}

	public static monitoring.proxies.PowerRealTimeData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return monitoring.proxies.PowerRealTimeData.initialize(context, mendixObject);
	}

	public static java.util.List<monitoring.proxies.PowerRealTimeData> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> monitoring.proxies.PowerRealTimeData.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of ActivePower
	 */
	public final java.math.BigDecimal getActivePower()
	{
		return getActivePower(getContext());
	}

	/**
	 * @param context
	 * @return value of ActivePower
	 */
	public final java.math.BigDecimal getActivePower(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.ActivePower.toString());
	}

	/**
	 * Set value of ActivePower
	 * @param activepower
	 */
	public final void setActivePower(java.math.BigDecimal activepower)
	{
		setActivePower(getContext(), activepower);
	}

	/**
	 * Set value of ActivePower
	 * @param context
	 * @param activepower
	 */
	public final void setActivePower(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal activepower)
	{
		getMendixObject().setValue(context, MemberNames.ActivePower.toString(), activepower);
	}

	/**
	 * @return value of MaxPower
	 */
	public final java.math.BigDecimal getMaxPower()
	{
		return getMaxPower(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxPower
	 */
	public final java.math.BigDecimal getMaxPower(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.MaxPower.toString());
	}

	/**
	 * Set value of MaxPower
	 * @param maxpower
	 */
	public final void setMaxPower(java.math.BigDecimal maxpower)
	{
		setMaxPower(getContext(), maxpower);
	}

	/**
	 * Set value of MaxPower
	 * @param context
	 * @param maxpower
	 */
	public final void setMaxPower(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal maxpower)
	{
		getMendixObject().setValue(context, MemberNames.MaxPower.toString(), maxpower);
	}

	/**
	 * @return value of TimeStamp
	 */
	public final java.util.Date getTimeStamp()
	{
		return getTimeStamp(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeStamp
	 */
	public final java.util.Date getTimeStamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.TimeStamp.toString());
	}

	/**
	 * Set value of TimeStamp
	 * @param timestamp
	 */
	public final void setTimeStamp(java.util.Date timestamp)
	{
		setTimeStamp(getContext(), timestamp);
	}

	/**
	 * Set value of TimeStamp
	 * @param context
	 * @param timestamp
	 */
	public final void setTimeStamp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timestamp)
	{
		getMendixObject().setValue(context, MemberNames.TimeStamp.toString(), timestamp);
	}

	/**
	 * @return value of PowerFactor
	 */
	public final java.math.BigDecimal getPowerFactor()
	{
		return getPowerFactor(getContext());
	}

	/**
	 * @param context
	 * @return value of PowerFactor
	 */
	public final java.math.BigDecimal getPowerFactor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.PowerFactor.toString());
	}

	/**
	 * Set value of PowerFactor
	 * @param powerfactor
	 */
	public final void setPowerFactor(java.math.BigDecimal powerfactor)
	{
		setPowerFactor(getContext(), powerfactor);
	}

	/**
	 * Set value of PowerFactor
	 * @param context
	 * @param powerfactor
	 */
	public final void setPowerFactor(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal powerfactor)
	{
		getMendixObject().setValue(context, MemberNames.PowerFactor.toString(), powerfactor);
	}

	/**
	 * @return value of PowerUsage
	 */
	public final java.math.BigDecimal getPowerUsage()
	{
		return getPowerUsage(getContext());
	}

	/**
	 * @param context
	 * @return value of PowerUsage
	 */
	public final java.math.BigDecimal getPowerUsage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.PowerUsage.toString());
	}

	/**
	 * Set value of PowerUsage
	 * @param powerusage
	 */
	public final void setPowerUsage(java.math.BigDecimal powerusage)
	{
		setPowerUsage(getContext(), powerusage);
	}

	/**
	 * Set value of PowerUsage
	 * @param context
	 * @param powerusage
	 */
	public final void setPowerUsage(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal powerusage)
	{
		getMendixObject().setValue(context, MemberNames.PowerUsage.toString(), powerusage);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of PowerRealTimeData_Equipment
	 */
	public final equipment_management.proxies.Equipment getPowerRealTimeData_Equipment() throws com.mendix.core.CoreException
	{
		return getPowerRealTimeData_Equipment(getContext());
	}

	/**
	 * @param context
	 * @return value of PowerRealTimeData_Equipment
	 * @throws com.mendix.core.CoreException
	 */
	public final equipment_management.proxies.Equipment getPowerRealTimeData_Equipment(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		equipment_management.proxies.Equipment result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PowerRealTimeData_Equipment.toString());
		if (identifier != null) {
			result = equipment_management.proxies.Equipment.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of PowerRealTimeData_Equipment
	 * @param powerrealtimedata_equipment
	 */
	public final void setPowerRealTimeData_Equipment(equipment_management.proxies.Equipment powerrealtimedata_equipment)
	{
		setPowerRealTimeData_Equipment(getContext(), powerrealtimedata_equipment);
	}

	/**
	 * Set value of PowerRealTimeData_Equipment
	 * @param context
	 * @param powerrealtimedata_equipment
	 */
	public final void setPowerRealTimeData_Equipment(com.mendix.systemwideinterfaces.core.IContext context, equipment_management.proxies.Equipment powerrealtimedata_equipment)
	{
		if (powerrealtimedata_equipment == null) {
			getMendixObject().setValue(context, MemberNames.PowerRealTimeData_Equipment.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.PowerRealTimeData_Equipment.toString(), powerrealtimedata_equipment.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return powerRealTimeDataMendixObject;
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
			final monitoring.proxies.PowerRealTimeData that = (monitoring.proxies.PowerRealTimeData) obj;
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