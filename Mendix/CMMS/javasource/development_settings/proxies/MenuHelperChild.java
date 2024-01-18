// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package development_settings.proxies;

/**
 * 최초 작성자 : 김동명
 * 최초 작성일 : 2023/09/20
 * 최종 수정자 : 
 * 최종 수정일 : 2023/09/20
 * 설명 : 트리에서 선택한 노드의 정보를 불러오기 위한 PE
 * Version 1.0 : 생성
 */
public class MenuHelperChild implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject menuHelperChildMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Development_Settings.MenuHelperChild";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Acitve("Acitve"),
		MenuHelperChild_Account("Development_Settings.MenuHelperChild_Account");

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

	public MenuHelperChild(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected MenuHelperChild(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject menuHelperChildMendixObject)
	{
		if (menuHelperChildMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, menuHelperChildMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.menuHelperChildMendixObject = menuHelperChildMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static development_settings.proxies.MenuHelperChild initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new development_settings.proxies.MenuHelperChild(context, mendixObject);
	}

	public static development_settings.proxies.MenuHelperChild load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return development_settings.proxies.MenuHelperChild.initialize(context, mendixObject);
	}

	public static java.util.List<development_settings.proxies.MenuHelperChild> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> development_settings.proxies.MenuHelperChild.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Acitve
	 */
	public final java.lang.Boolean getAcitve()
	{
		return getAcitve(getContext());
	}

	/**
	 * @param context
	 * @return value of Acitve
	 */
	public final java.lang.Boolean getAcitve(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Acitve.toString());
	}

	/**
	 * Set value of Acitve
	 * @param acitve
	 */
	public final void setAcitve(java.lang.Boolean acitve)
	{
		setAcitve(getContext(), acitve);
	}

	/**
	 * Set value of Acitve
	 * @param context
	 * @param acitve
	 */
	public final void setAcitve(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean acitve)
	{
		getMendixObject().setValue(context, MemberNames.Acitve.toString(), acitve);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of MenuHelperChild_Account
	 */
	public final administration.proxies.Account getMenuHelperChild_Account() throws com.mendix.core.CoreException
	{
		return getMenuHelperChild_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of MenuHelperChild_Account
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getMenuHelperChild_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MenuHelperChild_Account.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of MenuHelperChild_Account
	 * @param menuhelperchild_account
	 */
	public final void setMenuHelperChild_Account(administration.proxies.Account menuhelperchild_account)
	{
		setMenuHelperChild_Account(getContext(), menuhelperchild_account);
	}

	/**
	 * Set value of MenuHelperChild_Account
	 * @param context
	 * @param menuhelperchild_account
	 */
	public final void setMenuHelperChild_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account menuhelperchild_account)
	{
		if (menuhelperchild_account == null) {
			getMendixObject().setValue(context, MemberNames.MenuHelperChild_Account.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.MenuHelperChild_Account.toString(), menuhelperchild_account.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return menuHelperChildMendixObject;
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
			final development_settings.proxies.MenuHelperChild that = (development_settings.proxies.MenuHelperChild) obj;
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