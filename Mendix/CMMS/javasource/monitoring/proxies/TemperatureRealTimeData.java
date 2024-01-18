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
public class TemperatureRealTimeData implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject temperatureRealTimeDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Monitoring.TemperatureRealTimeData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CurrentTemp("CurrentTemp"),
		MaxTemp("MaxTemp"),
		TimeStamp("TimeStamp"),
		TemperatureRealTimeData_Equipment("Monitoring.TemperatureRealTimeData_Equipment");

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

	public TemperatureRealTimeData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TemperatureRealTimeData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject temperatureRealTimeDataMendixObject)
	{
		if (temperatureRealTimeDataMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, temperatureRealTimeDataMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.temperatureRealTimeDataMendixObject = temperatureRealTimeDataMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static monitoring.proxies.TemperatureRealTimeData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new monitoring.proxies.TemperatureRealTimeData(context, mendixObject);
	}

	public static monitoring.proxies.TemperatureRealTimeData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return monitoring.proxies.TemperatureRealTimeData.initialize(context, mendixObject);
	}

	public static java.util.List<monitoring.proxies.TemperatureRealTimeData> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> monitoring.proxies.TemperatureRealTimeData.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of CurrentTemp
	 */
	public final java.math.BigDecimal getCurrentTemp()
	{
		return getCurrentTemp(getContext());
	}

	/**
	 * @param context
	 * @return value of CurrentTemp
	 */
	public final java.math.BigDecimal getCurrentTemp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.CurrentTemp.toString());
	}

	/**
	 * Set value of CurrentTemp
	 * @param currenttemp
	 */
	public final void setCurrentTemp(java.math.BigDecimal currenttemp)
	{
		setCurrentTemp(getContext(), currenttemp);
	}

	/**
	 * Set value of CurrentTemp
	 * @param context
	 * @param currenttemp
	 */
	public final void setCurrentTemp(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal currenttemp)
	{
		getMendixObject().setValue(context, MemberNames.CurrentTemp.toString(), currenttemp);
	}

	/**
	 * @return value of MaxTemp
	 */
	public final java.math.BigDecimal getMaxTemp()
	{
		return getMaxTemp(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxTemp
	 */
	public final java.math.BigDecimal getMaxTemp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.MaxTemp.toString());
	}

	/**
	 * Set value of MaxTemp
	 * @param maxtemp
	 */
	public final void setMaxTemp(java.math.BigDecimal maxtemp)
	{
		setMaxTemp(getContext(), maxtemp);
	}

	/**
	 * Set value of MaxTemp
	 * @param context
	 * @param maxtemp
	 */
	public final void setMaxTemp(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal maxtemp)
	{
		getMendixObject().setValue(context, MemberNames.MaxTemp.toString(), maxtemp);
	}

	/**
	 * @return value of TimeStamp
	 */
	public final java.lang.String getTimeStamp()
	{
		return getTimeStamp(getContext());
	}

	/**
	 * @param context
	 * @return value of TimeStamp
	 */
	public final java.lang.String getTimeStamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TimeStamp.toString());
	}

	/**
	 * Set value of TimeStamp
	 * @param timestamp
	 */
	public final void setTimeStamp(java.lang.String timestamp)
	{
		setTimeStamp(getContext(), timestamp);
	}

	/**
	 * Set value of TimeStamp
	 * @param context
	 * @param timestamp
	 */
	public final void setTimeStamp(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String timestamp)
	{
		getMendixObject().setValue(context, MemberNames.TimeStamp.toString(), timestamp);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of TemperatureRealTimeData_Equipment
	 */
	public final equipment_management.proxies.Equipment getTemperatureRealTimeData_Equipment() throws com.mendix.core.CoreException
	{
		return getTemperatureRealTimeData_Equipment(getContext());
	}

	/**
	 * @param context
	 * @return value of TemperatureRealTimeData_Equipment
	 * @throws com.mendix.core.CoreException
	 */
	public final equipment_management.proxies.Equipment getTemperatureRealTimeData_Equipment(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		equipment_management.proxies.Equipment result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TemperatureRealTimeData_Equipment.toString());
		if (identifier != null) {
			result = equipment_management.proxies.Equipment.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of TemperatureRealTimeData_Equipment
	 * @param temperaturerealtimedata_equipment
	 */
	public final void setTemperatureRealTimeData_Equipment(equipment_management.proxies.Equipment temperaturerealtimedata_equipment)
	{
		setTemperatureRealTimeData_Equipment(getContext(), temperaturerealtimedata_equipment);
	}

	/**
	 * Set value of TemperatureRealTimeData_Equipment
	 * @param context
	 * @param temperaturerealtimedata_equipment
	 */
	public final void setTemperatureRealTimeData_Equipment(com.mendix.systemwideinterfaces.core.IContext context, equipment_management.proxies.Equipment temperaturerealtimedata_equipment)
	{
		if (temperaturerealtimedata_equipment == null) {
			getMendixObject().setValue(context, MemberNames.TemperatureRealTimeData_Equipment.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.TemperatureRealTimeData_Equipment.toString(), temperaturerealtimedata_equipment.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return temperatureRealTimeDataMendixObject;
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
			final monitoring.proxies.TemperatureRealTimeData that = (monitoring.proxies.TemperatureRealTimeData) obj;
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