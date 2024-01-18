// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package equipment_management.proxies;

/**
 * 최초작성자 : 김동명
 * 최초작성일 : 2023-11-27
 * 
 * 설명 : 목록에서 갯수 세기 용도 Helper
 * 
 * V1.0 : 최초작성
 */
public class Equipment_SpecificationCount implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject equipment_SpecificationCountMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Equipment_Management.Equipment_SpecificationCount";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SpecificationCount("SpecificationCount");

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

	public Equipment_SpecificationCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Equipment_SpecificationCount(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject equipment_SpecificationCountMendixObject)
	{
		if (equipment_SpecificationCountMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, equipment_SpecificationCountMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.equipment_SpecificationCountMendixObject = equipment_SpecificationCountMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static equipment_management.proxies.Equipment_SpecificationCount initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new equipment_management.proxies.Equipment_SpecificationCount(context, mendixObject);
	}

	public static equipment_management.proxies.Equipment_SpecificationCount load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return equipment_management.proxies.Equipment_SpecificationCount.initialize(context, mendixObject);
	}

	/**
	 * @return value of SpecificationCount
	 */
	public final java.lang.Integer getSpecificationCount()
	{
		return getSpecificationCount(getContext());
	}

	/**
	 * @param context
	 * @return value of SpecificationCount
	 */
	public final java.lang.Integer getSpecificationCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.SpecificationCount.toString());
	}

	/**
	 * Set value of SpecificationCount
	 * @param specificationcount
	 */
	public final void setSpecificationCount(java.lang.Integer specificationcount)
	{
		setSpecificationCount(getContext(), specificationcount);
	}

	/**
	 * Set value of SpecificationCount
	 * @param context
	 * @param specificationcount
	 */
	public final void setSpecificationCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer specificationcount)
	{
		getMendixObject().setValue(context, MemberNames.SpecificationCount.toString(), specificationcount);
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return equipment_SpecificationCountMendixObject;
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
			final equipment_management.proxies.Equipment_SpecificationCount that = (equipment_management.proxies.Equipment_SpecificationCount) obj;
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