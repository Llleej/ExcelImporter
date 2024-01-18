// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package monitoring.proxies;

/**
 * 최초 작성자 : 이단비
 * 최초 작성일 : 2023/10/05
 * 최종 수정자 : 
 * 최종 수정일 : 2023/10/05
 * 설명 : 센서 모니터링 규칙
 * Version 1.0 : 생성
 */
public class SensorMonitoringRule implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sensorMonitoringRuleMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Monitoring.SensorMonitoringRule";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Rule("Rule"),
		FalseCount("FalseCount"),
		TriggingCuunt("TriggingCuunt"),
		IsStart("IsStart"),
		Active("Active"),
		SensorMonitoringRule_Sensor("Monitoring.SensorMonitoringRule_Sensor");

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

	public SensorMonitoringRule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SensorMonitoringRule(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sensorMonitoringRuleMendixObject)
	{
		if (sensorMonitoringRuleMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, sensorMonitoringRuleMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.sensorMonitoringRuleMendixObject = sensorMonitoringRuleMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static monitoring.proxies.SensorMonitoringRule initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new monitoring.proxies.SensorMonitoringRule(context, mendixObject);
	}

	public static monitoring.proxies.SensorMonitoringRule load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return monitoring.proxies.SensorMonitoringRule.initialize(context, mendixObject);
	}

	public static java.util.List<monitoring.proxies.SensorMonitoringRule> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> monitoring.proxies.SensorMonitoringRule.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Rule
	 */
	public final java.lang.String getRule()
	{
		return getRule(getContext());
	}

	/**
	 * @param context
	 * @return value of Rule
	 */
	public final java.lang.String getRule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Rule.toString());
	}

	/**
	 * Set value of Rule
	 * @param rule
	 */
	public final void setRule(java.lang.String rule)
	{
		setRule(getContext(), rule);
	}

	/**
	 * Set value of Rule
	 * @param context
	 * @param rule
	 */
	public final void setRule(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String rule)
	{
		getMendixObject().setValue(context, MemberNames.Rule.toString(), rule);
	}

	/**
	 * @return value of FalseCount
	 */
	public final java.lang.Integer getFalseCount()
	{
		return getFalseCount(getContext());
	}

	/**
	 * @param context
	 * @return value of FalseCount
	 */
	public final java.lang.Integer getFalseCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.FalseCount.toString());
	}

	/**
	 * Set value of FalseCount
	 * @param falsecount
	 */
	public final void setFalseCount(java.lang.Integer falsecount)
	{
		setFalseCount(getContext(), falsecount);
	}

	/**
	 * Set value of FalseCount
	 * @param context
	 * @param falsecount
	 */
	public final void setFalseCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer falsecount)
	{
		getMendixObject().setValue(context, MemberNames.FalseCount.toString(), falsecount);
	}

	/**
	 * @return value of TriggingCuunt
	 */
	public final java.lang.Integer getTriggingCuunt()
	{
		return getTriggingCuunt(getContext());
	}

	/**
	 * @param context
	 * @return value of TriggingCuunt
	 */
	public final java.lang.Integer getTriggingCuunt(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TriggingCuunt.toString());
	}

	/**
	 * Set value of TriggingCuunt
	 * @param triggingcuunt
	 */
	public final void setTriggingCuunt(java.lang.Integer triggingcuunt)
	{
		setTriggingCuunt(getContext(), triggingcuunt);
	}

	/**
	 * Set value of TriggingCuunt
	 * @param context
	 * @param triggingcuunt
	 */
	public final void setTriggingCuunt(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer triggingcuunt)
	{
		getMendixObject().setValue(context, MemberNames.TriggingCuunt.toString(), triggingcuunt);
	}

	/**
	 * @return value of IsStart
	 */
	public final java.lang.Boolean getIsStart()
	{
		return getIsStart(getContext());
	}

	/**
	 * @param context
	 * @return value of IsStart
	 */
	public final java.lang.Boolean getIsStart(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsStart.toString());
	}

	/**
	 * Set value of IsStart
	 * @param isstart
	 */
	public final void setIsStart(java.lang.Boolean isstart)
	{
		setIsStart(getContext(), isstart);
	}

	/**
	 * Set value of IsStart
	 * @param context
	 * @param isstart
	 */
	public final void setIsStart(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isstart)
	{
		getMendixObject().setValue(context, MemberNames.IsStart.toString(), isstart);
	}

	/**
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive()
	{
		return getActive(getContext());
	}

	/**
	 * @param context
	 * @return value of Active
	 */
	public final java.lang.Boolean getActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Active.toString());
	}

	/**
	 * Set value of Active
	 * @param active
	 */
	public final void setActive(java.lang.Boolean active)
	{
		setActive(getContext(), active);
	}

	/**
	 * Set value of Active
	 * @param context
	 * @param active
	 */
	public final void setActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean active)
	{
		getMendixObject().setValue(context, MemberNames.Active.toString(), active);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of SensorMonitoringRule_Sensor
	 */
	public final monitoring.proxies.Sensor getSensorMonitoringRule_Sensor() throws com.mendix.core.CoreException
	{
		return getSensorMonitoringRule_Sensor(getContext());
	}

	/**
	 * @param context
	 * @return value of SensorMonitoringRule_Sensor
	 * @throws com.mendix.core.CoreException
	 */
	public final monitoring.proxies.Sensor getSensorMonitoringRule_Sensor(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		monitoring.proxies.Sensor result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SensorMonitoringRule_Sensor.toString());
		if (identifier != null) {
			result = monitoring.proxies.Sensor.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of SensorMonitoringRule_Sensor
	 * @param sensormonitoringrule_sensor
	 */
	public final void setSensorMonitoringRule_Sensor(monitoring.proxies.Sensor sensormonitoringrule_sensor)
	{
		setSensorMonitoringRule_Sensor(getContext(), sensormonitoringrule_sensor);
	}

	/**
	 * Set value of SensorMonitoringRule_Sensor
	 * @param context
	 * @param sensormonitoringrule_sensor
	 */
	public final void setSensorMonitoringRule_Sensor(com.mendix.systemwideinterfaces.core.IContext context, monitoring.proxies.Sensor sensormonitoringrule_sensor)
	{
		if (sensormonitoringrule_sensor == null) {
			getMendixObject().setValue(context, MemberNames.SensorMonitoringRule_Sensor.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.SensorMonitoringRule_Sensor.toString(), sensormonitoringrule_sensor.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sensorMonitoringRuleMendixObject;
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
			final monitoring.proxies.SensorMonitoringRule that = (monitoring.proxies.SensorMonitoringRule) obj;
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