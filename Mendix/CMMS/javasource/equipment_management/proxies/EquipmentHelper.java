// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package equipment_management.proxies;

public class EquipmentHelper implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject equipmentHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Equipment_Management.EquipmentHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Active("Active"),
		RootSelect("RootSelect"),
		EquipmentHelper_Account("Equipment_Management.EquipmentHelper_Account");

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

	public EquipmentHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected EquipmentHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject equipmentHelperMendixObject)
	{
		if (equipmentHelperMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, equipmentHelperMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.equipmentHelperMendixObject = equipmentHelperMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static equipment_management.proxies.EquipmentHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new equipment_management.proxies.EquipmentHelper(context, mendixObject);
	}

	public static equipment_management.proxies.EquipmentHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return equipment_management.proxies.EquipmentHelper.initialize(context, mendixObject);
	}

	public static java.util.List<equipment_management.proxies.EquipmentHelper> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> equipment_management.proxies.EquipmentHelper.initialize(context, obj))
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
	 * @return value of RootSelect
	 */
	public final java.lang.Boolean getRootSelect()
	{
		return getRootSelect(getContext());
	}

	/**
	 * @param context
	 * @return value of RootSelect
	 */
	public final java.lang.Boolean getRootSelect(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.RootSelect.toString());
	}

	/**
	 * Set value of RootSelect
	 * @param rootselect
	 */
	public final void setRootSelect(java.lang.Boolean rootselect)
	{
		setRootSelect(getContext(), rootselect);
	}

	/**
	 * Set value of RootSelect
	 * @param context
	 * @param rootselect
	 */
	public final void setRootSelect(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean rootselect)
	{
		getMendixObject().setValue(context, MemberNames.RootSelect.toString(), rootselect);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of EquipmentHelper_Account
	 */
	public final administration.proxies.Account getEquipmentHelper_Account() throws com.mendix.core.CoreException
	{
		return getEquipmentHelper_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of EquipmentHelper_Account
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getEquipmentHelper_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.EquipmentHelper_Account.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of EquipmentHelper_Account
	 * @param equipmenthelper_account
	 */
	public final void setEquipmentHelper_Account(administration.proxies.Account equipmenthelper_account)
	{
		setEquipmentHelper_Account(getContext(), equipmenthelper_account);
	}

	/**
	 * Set value of EquipmentHelper_Account
	 * @param context
	 * @param equipmenthelper_account
	 */
	public final void setEquipmentHelper_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account equipmenthelper_account)
	{
		if (equipmenthelper_account == null) {
			getMendixObject().setValue(context, MemberNames.EquipmentHelper_Account.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.EquipmentHelper_Account.toString(), equipmenthelper_account.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return equipmentHelperMendixObject;
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
			final equipment_management.proxies.EquipmentHelper that = (equipment_management.proxies.EquipmentHelper) obj;
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
