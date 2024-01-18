// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package work_management.proxies;

/**
 * 최초 작성자 : 박성안
 * 최초 작성일 : 2023/11/6
 * 설명 : WorkOrder Kanban 필터를 위한 엔터티
 * Version 1.0 : 생성
 */
public class FilterHelper implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject filterHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Work_Management.FilterHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Emergency("Emergency"),
		High("High"),
		Mid("Mid"),
		Low("Low"),
		Nolimit("Nolimit"),
		Equipment("Equipment"),
		Department("Department"),
		User("User"),
		DepartmentActive("DepartmentActive"),
		UserActive("UserActive"),
		EquipmentCount("EquipmentCount"),
		DepartmentCount("DepartmentCount"),
		UserCount("UserCount");

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

	public FilterHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected FilterHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject filterHelperMendixObject)
	{
		if (filterHelperMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, filterHelperMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.filterHelperMendixObject = filterHelperMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static work_management.proxies.FilterHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new work_management.proxies.FilterHelper(context, mendixObject);
	}

	public static work_management.proxies.FilterHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return work_management.proxies.FilterHelper.initialize(context, mendixObject);
	}

	/**
	 * @return value of Emergency
	 */
	public final java.lang.Boolean getEmergency()
	{
		return getEmergency(getContext());
	}

	/**
	 * @param context
	 * @return value of Emergency
	 */
	public final java.lang.Boolean getEmergency(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Emergency.toString());
	}

	/**
	 * Set value of Emergency
	 * @param emergency
	 */
	public final void setEmergency(java.lang.Boolean emergency)
	{
		setEmergency(getContext(), emergency);
	}

	/**
	 * Set value of Emergency
	 * @param context
	 * @param emergency
	 */
	public final void setEmergency(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean emergency)
	{
		getMendixObject().setValue(context, MemberNames.Emergency.toString(), emergency);
	}

	/**
	 * @return value of High
	 */
	public final java.lang.Boolean getHigh()
	{
		return getHigh(getContext());
	}

	/**
	 * @param context
	 * @return value of High
	 */
	public final java.lang.Boolean getHigh(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.High.toString());
	}

	/**
	 * Set value of High
	 * @param high
	 */
	public final void setHigh(java.lang.Boolean high)
	{
		setHigh(getContext(), high);
	}

	/**
	 * Set value of High
	 * @param context
	 * @param high
	 */
	public final void setHigh(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean high)
	{
		getMendixObject().setValue(context, MemberNames.High.toString(), high);
	}

	/**
	 * @return value of Mid
	 */
	public final java.lang.Boolean getMid()
	{
		return getMid(getContext());
	}

	/**
	 * @param context
	 * @return value of Mid
	 */
	public final java.lang.Boolean getMid(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Mid.toString());
	}

	/**
	 * Set value of Mid
	 * @param mid
	 */
	public final void setMid(java.lang.Boolean mid)
	{
		setMid(getContext(), mid);
	}

	/**
	 * Set value of Mid
	 * @param context
	 * @param mid
	 */
	public final void setMid(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean mid)
	{
		getMendixObject().setValue(context, MemberNames.Mid.toString(), mid);
	}

	/**
	 * @return value of Low
	 */
	public final java.lang.Boolean getLow()
	{
		return getLow(getContext());
	}

	/**
	 * @param context
	 * @return value of Low
	 */
	public final java.lang.Boolean getLow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Low.toString());
	}

	/**
	 * Set value of Low
	 * @param low
	 */
	public final void setLow(java.lang.Boolean low)
	{
		setLow(getContext(), low);
	}

	/**
	 * Set value of Low
	 * @param context
	 * @param low
	 */
	public final void setLow(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean low)
	{
		getMendixObject().setValue(context, MemberNames.Low.toString(), low);
	}

	/**
	 * @return value of Nolimit
	 */
	public final java.lang.Boolean getNolimit()
	{
		return getNolimit(getContext());
	}

	/**
	 * @param context
	 * @return value of Nolimit
	 */
	public final java.lang.Boolean getNolimit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Nolimit.toString());
	}

	/**
	 * Set value of Nolimit
	 * @param nolimit
	 */
	public final void setNolimit(java.lang.Boolean nolimit)
	{
		setNolimit(getContext(), nolimit);
	}

	/**
	 * Set value of Nolimit
	 * @param context
	 * @param nolimit
	 */
	public final void setNolimit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean nolimit)
	{
		getMendixObject().setValue(context, MemberNames.Nolimit.toString(), nolimit);
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
	 * @return value of Department
	 */
	public final java.lang.String getDepartment()
	{
		return getDepartment(getContext());
	}

	/**
	 * @param context
	 * @return value of Department
	 */
	public final java.lang.String getDepartment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Department.toString());
	}

	/**
	 * Set value of Department
	 * @param department
	 */
	public final void setDepartment(java.lang.String department)
	{
		setDepartment(getContext(), department);
	}

	/**
	 * Set value of Department
	 * @param context
	 * @param department
	 */
	public final void setDepartment(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String department)
	{
		getMendixObject().setValue(context, MemberNames.Department.toString(), department);
	}

	/**
	 * @return value of User
	 */
	public final java.lang.String getUser()
	{
		return getUser(getContext());
	}

	/**
	 * @param context
	 * @return value of User
	 */
	public final java.lang.String getUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.User.toString());
	}

	/**
	 * Set value of User
	 * @param user
	 */
	public final void setUser(java.lang.String user)
	{
		setUser(getContext(), user);
	}

	/**
	 * Set value of User
	 * @param context
	 * @param user
	 */
	public final void setUser(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String user)
	{
		getMendixObject().setValue(context, MemberNames.User.toString(), user);
	}

	/**
	 * @return value of DepartmentActive
	 */
	public final java.lang.Boolean getDepartmentActive()
	{
		return getDepartmentActive(getContext());
	}

	/**
	 * @param context
	 * @return value of DepartmentActive
	 */
	public final java.lang.Boolean getDepartmentActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DepartmentActive.toString());
	}

	/**
	 * Set value of DepartmentActive
	 * @param departmentactive
	 */
	public final void setDepartmentActive(java.lang.Boolean departmentactive)
	{
		setDepartmentActive(getContext(), departmentactive);
	}

	/**
	 * Set value of DepartmentActive
	 * @param context
	 * @param departmentactive
	 */
	public final void setDepartmentActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean departmentactive)
	{
		getMendixObject().setValue(context, MemberNames.DepartmentActive.toString(), departmentactive);
	}

	/**
	 * @return value of UserActive
	 */
	public final java.lang.Boolean getUserActive()
	{
		return getUserActive(getContext());
	}

	/**
	 * @param context
	 * @return value of UserActive
	 */
	public final java.lang.Boolean getUserActive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UserActive.toString());
	}

	/**
	 * Set value of UserActive
	 * @param useractive
	 */
	public final void setUserActive(java.lang.Boolean useractive)
	{
		setUserActive(getContext(), useractive);
	}

	/**
	 * Set value of UserActive
	 * @param context
	 * @param useractive
	 */
	public final void setUserActive(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean useractive)
	{
		getMendixObject().setValue(context, MemberNames.UserActive.toString(), useractive);
	}

	/**
	 * @return value of EquipmentCount
	 */
	public final java.lang.Integer getEquipmentCount()
	{
		return getEquipmentCount(getContext());
	}

	/**
	 * @param context
	 * @return value of EquipmentCount
	 */
	public final java.lang.Integer getEquipmentCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.EquipmentCount.toString());
	}

	/**
	 * Set value of EquipmentCount
	 * @param equipmentcount
	 */
	public final void setEquipmentCount(java.lang.Integer equipmentcount)
	{
		setEquipmentCount(getContext(), equipmentcount);
	}

	/**
	 * Set value of EquipmentCount
	 * @param context
	 * @param equipmentcount
	 */
	public final void setEquipmentCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer equipmentcount)
	{
		getMendixObject().setValue(context, MemberNames.EquipmentCount.toString(), equipmentcount);
	}

	/**
	 * @return value of DepartmentCount
	 */
	public final java.lang.Integer getDepartmentCount()
	{
		return getDepartmentCount(getContext());
	}

	/**
	 * @param context
	 * @return value of DepartmentCount
	 */
	public final java.lang.Integer getDepartmentCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.DepartmentCount.toString());
	}

	/**
	 * Set value of DepartmentCount
	 * @param departmentcount
	 */
	public final void setDepartmentCount(java.lang.Integer departmentcount)
	{
		setDepartmentCount(getContext(), departmentcount);
	}

	/**
	 * Set value of DepartmentCount
	 * @param context
	 * @param departmentcount
	 */
	public final void setDepartmentCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer departmentcount)
	{
		getMendixObject().setValue(context, MemberNames.DepartmentCount.toString(), departmentcount);
	}

	/**
	 * @return value of UserCount
	 */
	public final java.lang.Integer getUserCount()
	{
		return getUserCount(getContext());
	}

	/**
	 * @param context
	 * @return value of UserCount
	 */
	public final java.lang.Integer getUserCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.UserCount.toString());
	}

	/**
	 * Set value of UserCount
	 * @param usercount
	 */
	public final void setUserCount(java.lang.Integer usercount)
	{
		setUserCount(getContext(), usercount);
	}

	/**
	 * Set value of UserCount
	 * @param context
	 * @param usercount
	 */
	public final void setUserCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer usercount)
	{
		getMendixObject().setValue(context, MemberNames.UserCount.toString(), usercount);
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return filterHelperMendixObject;
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
			final work_management.proxies.FilterHelper that = (work_management.proxies.FilterHelper) obj;
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
