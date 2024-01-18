// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package monitoring.proxies;

public class MonitoringChartData implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject monitoringChartDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Monitoring.MonitoringChartData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FormattedTimeStamp("FormattedTimeStamp"),
		Power("Power");

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

	public MonitoringChartData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected MonitoringChartData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject monitoringChartDataMendixObject)
	{
		if (monitoringChartDataMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, monitoringChartDataMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.monitoringChartDataMendixObject = monitoringChartDataMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static monitoring.proxies.MonitoringChartData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new monitoring.proxies.MonitoringChartData(context, mendixObject);
	}

	public static monitoring.proxies.MonitoringChartData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return monitoring.proxies.MonitoringChartData.initialize(context, mendixObject);
	}

	/**
	 * @return value of FormattedTimeStamp
	 */
	public final java.lang.String getFormattedTimeStamp()
	{
		return getFormattedTimeStamp(getContext());
	}

	/**
	 * @param context
	 * @return value of FormattedTimeStamp
	 */
	public final java.lang.String getFormattedTimeStamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FormattedTimeStamp.toString());
	}

	/**
	 * Set value of FormattedTimeStamp
	 * @param formattedtimestamp
	 */
	public final void setFormattedTimeStamp(java.lang.String formattedtimestamp)
	{
		setFormattedTimeStamp(getContext(), formattedtimestamp);
	}

	/**
	 * Set value of FormattedTimeStamp
	 * @param context
	 * @param formattedtimestamp
	 */
	public final void setFormattedTimeStamp(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String formattedtimestamp)
	{
		getMendixObject().setValue(context, MemberNames.FormattedTimeStamp.toString(), formattedtimestamp);
	}

	/**
	 * @return value of Power
	 */
	public final java.math.BigDecimal getPower()
	{
		return getPower(getContext());
	}

	/**
	 * @param context
	 * @return value of Power
	 */
	public final java.math.BigDecimal getPower(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Power.toString());
	}

	/**
	 * Set value of Power
	 * @param power
	 */
	public final void setPower(java.math.BigDecimal power)
	{
		setPower(getContext(), power);
	}

	/**
	 * Set value of Power
	 * @param context
	 * @param power
	 */
	public final void setPower(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal power)
	{
		getMendixObject().setValue(context, MemberNames.Power.toString(), power);
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return monitoringChartDataMendixObject;
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
			final monitoring.proxies.MonitoringChartData that = (monitoring.proxies.MonitoringChartData) obj;
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
