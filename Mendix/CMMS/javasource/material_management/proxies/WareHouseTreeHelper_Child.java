// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package material_management.proxies;

public class WareHouseTreeHelper_Child implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject wareHouseTreeHelper_ChildMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Material_Management.WareHouseTreeHelper_Child";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Active("Active"),
		WareHouseTreeHelper_Child_Account("Material_Management.WareHouseTreeHelper_Child_Account");

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

	public WareHouseTreeHelper_Child(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected WareHouseTreeHelper_Child(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject wareHouseTreeHelper_ChildMendixObject)
	{
		if (wareHouseTreeHelper_ChildMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, wareHouseTreeHelper_ChildMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.wareHouseTreeHelper_ChildMendixObject = wareHouseTreeHelper_ChildMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static material_management.proxies.WareHouseTreeHelper_Child initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new material_management.proxies.WareHouseTreeHelper_Child(context, mendixObject);
	}

	public static material_management.proxies.WareHouseTreeHelper_Child load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return material_management.proxies.WareHouseTreeHelper_Child.initialize(context, mendixObject);
	}

	public static java.util.List<material_management.proxies.WareHouseTreeHelper_Child> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> material_management.proxies.WareHouseTreeHelper_Child.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
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
	 * @return value of WareHouseTreeHelper_Child_Account
	 */
	public final administration.proxies.Account getWareHouseTreeHelper_Child_Account() throws com.mendix.core.CoreException
	{
		return getWareHouseTreeHelper_Child_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of WareHouseTreeHelper_Child_Account
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getWareHouseTreeHelper_Child_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WareHouseTreeHelper_Child_Account.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of WareHouseTreeHelper_Child_Account
	 * @param warehousetreehelper_child_account
	 */
	public final void setWareHouseTreeHelper_Child_Account(administration.proxies.Account warehousetreehelper_child_account)
	{
		setWareHouseTreeHelper_Child_Account(getContext(), warehousetreehelper_child_account);
	}

	/**
	 * Set value of WareHouseTreeHelper_Child_Account
	 * @param context
	 * @param warehousetreehelper_child_account
	 */
	public final void setWareHouseTreeHelper_Child_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account warehousetreehelper_child_account)
	{
		if (warehousetreehelper_child_account == null) {
			getMendixObject().setValue(context, MemberNames.WareHouseTreeHelper_Child_Account.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.WareHouseTreeHelper_Child_Account.toString(), warehousetreehelper_child_account.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return wareHouseTreeHelper_ChildMendixObject;
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
			final material_management.proxies.WareHouseTreeHelper_Child that = (material_management.proxies.WareHouseTreeHelper_Child) obj;
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
