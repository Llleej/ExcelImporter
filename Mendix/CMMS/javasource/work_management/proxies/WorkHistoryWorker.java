// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package work_management.proxies;

public class WorkHistoryWorker implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject workHistoryWorkerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Work_Management.WorkHistoryWorker";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		WorkerName("WorkerName"),
		WorkerCode("WorkerCode"),
		WorkerDepartment("WorkerDepartment"),
		WorkHistoryWorker_WorkHistory("Work_Management.WorkHistoryWorker_WorkHistory");

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

	public WorkHistoryWorker(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WorkHistoryWorker(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workHistoryWorkerMendixObject)
	{
		if (workHistoryWorkerMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, workHistoryWorkerMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.workHistoryWorkerMendixObject = workHistoryWorkerMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static work_management.proxies.WorkHistoryWorker initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new work_management.proxies.WorkHistoryWorker(context, mendixObject);
	}

	public static work_management.proxies.WorkHistoryWorker load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return work_management.proxies.WorkHistoryWorker.initialize(context, mendixObject);
	}

	public static java.util.List<work_management.proxies.WorkHistoryWorker> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> work_management.proxies.WorkHistoryWorker.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of WorkerName
	 */
	public final java.lang.String getWorkerName()
	{
		return getWorkerName(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkerName
	 */
	public final java.lang.String getWorkerName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.WorkerName.toString());
	}

	/**
	 * Set value of WorkerName
	 * @param workername
	 */
	public final void setWorkerName(java.lang.String workername)
	{
		setWorkerName(getContext(), workername);
	}

	/**
	 * Set value of WorkerName
	 * @param context
	 * @param workername
	 */
	public final void setWorkerName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String workername)
	{
		getMendixObject().setValue(context, MemberNames.WorkerName.toString(), workername);
	}

	/**
	 * @return value of WorkerCode
	 */
	public final java.lang.String getWorkerCode()
	{
		return getWorkerCode(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkerCode
	 */
	public final java.lang.String getWorkerCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.WorkerCode.toString());
	}

	/**
	 * Set value of WorkerCode
	 * @param workercode
	 */
	public final void setWorkerCode(java.lang.String workercode)
	{
		setWorkerCode(getContext(), workercode);
	}

	/**
	 * Set value of WorkerCode
	 * @param context
	 * @param workercode
	 */
	public final void setWorkerCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String workercode)
	{
		getMendixObject().setValue(context, MemberNames.WorkerCode.toString(), workercode);
	}

	/**
	 * @return value of WorkerDepartment
	 */
	public final java.lang.String getWorkerDepartment()
	{
		return getWorkerDepartment(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkerDepartment
	 */
	public final java.lang.String getWorkerDepartment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.WorkerDepartment.toString());
	}

	/**
	 * Set value of WorkerDepartment
	 * @param workerdepartment
	 */
	public final void setWorkerDepartment(java.lang.String workerdepartment)
	{
		setWorkerDepartment(getContext(), workerdepartment);
	}

	/**
	 * Set value of WorkerDepartment
	 * @param context
	 * @param workerdepartment
	 */
	public final void setWorkerDepartment(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String workerdepartment)
	{
		getMendixObject().setValue(context, MemberNames.WorkerDepartment.toString(), workerdepartment);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of WorkHistoryWorker_WorkHistory
	 */
	public final work_management.proxies.WorkHistory getWorkHistoryWorker_WorkHistory() throws com.mendix.core.CoreException
	{
		return getWorkHistoryWorker_WorkHistory(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkHistoryWorker_WorkHistory
	 * @throws com.mendix.core.CoreException
	 */
	public final work_management.proxies.WorkHistory getWorkHistoryWorker_WorkHistory(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		work_management.proxies.WorkHistory result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkHistoryWorker_WorkHistory.toString());
		if (identifier != null) {
			result = work_management.proxies.WorkHistory.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WorkHistoryWorker_WorkHistory
	 * @param workhistoryworker_workhistory
	 */
	public final void setWorkHistoryWorker_WorkHistory(work_management.proxies.WorkHistory workhistoryworker_workhistory)
	{
		setWorkHistoryWorker_WorkHistory(getContext(), workhistoryworker_workhistory);
	}

	/**
	 * Set value of WorkHistoryWorker_WorkHistory
	 * @param context
	 * @param workhistoryworker_workhistory
	 */
	public final void setWorkHistoryWorker_WorkHistory(com.mendix.systemwideinterfaces.core.IContext context, work_management.proxies.WorkHistory workhistoryworker_workhistory)
	{
		if (workhistoryworker_workhistory == null) {
			getMendixObject().setValue(context, MemberNames.WorkHistoryWorker_WorkHistory.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WorkHistoryWorker_WorkHistory.toString(), workhistoryworker_workhistory.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return workHistoryWorkerMendixObject;
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
			final work_management.proxies.WorkHistoryWorker that = (work_management.proxies.WorkHistoryWorker) obj;
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
