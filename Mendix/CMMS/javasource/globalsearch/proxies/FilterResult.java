// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package globalsearch.proxies;

public class FilterResult implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject filterResultMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GlobalSearch.FilterResult";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Count("Count"),
		IsSelected("IsSelected"),
		FilterResult_Searcher("GlobalSearch.FilterResult_Searcher");

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

	public FilterResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected FilterResult(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject filterResultMendixObject)
	{
		if (filterResultMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, filterResultMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.filterResultMendixObject = filterResultMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static globalsearch.proxies.FilterResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new globalsearch.proxies.FilterResult(context, mendixObject);
	}

	public static globalsearch.proxies.FilterResult load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return globalsearch.proxies.FilterResult.initialize(context, mendixObject);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Count
	 */
	public final java.lang.Integer getCount()
	{
		return getCount(getContext());
	}

	/**
	 * @param context
	 * @return value of Count
	 */
	public final java.lang.Integer getCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Count.toString());
	}

	/**
	 * Set value of Count
	 * @param count
	 */
	public final void setCount(java.lang.Integer count)
	{
		setCount(getContext(), count);
	}

	/**
	 * Set value of Count
	 * @param context
	 * @param count
	 */
	public final void setCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer count)
	{
		getMendixObject().setValue(context, MemberNames.Count.toString(), count);
	}

	/**
	 * @return value of IsSelected
	 */
	public final java.lang.Boolean getIsSelected()
	{
		return getIsSelected(getContext());
	}

	/**
	 * @param context
	 * @return value of IsSelected
	 */
	public final java.lang.Boolean getIsSelected(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsSelected.toString());
	}

	/**
	 * Set value of IsSelected
	 * @param isselected
	 */
	public final void setIsSelected(java.lang.Boolean isselected)
	{
		setIsSelected(getContext(), isselected);
	}

	/**
	 * Set value of IsSelected
	 * @param context
	 * @param isselected
	 */
	public final void setIsSelected(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isselected)
	{
		getMendixObject().setValue(context, MemberNames.IsSelected.toString(), isselected);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of FilterResult_Searcher
	 */
	public final globalsearch.proxies.Searcher getFilterResult_Searcher() throws com.mendix.core.CoreException
	{
		return getFilterResult_Searcher(getContext());
	}

	/**
	 * @param context
	 * @return value of FilterResult_Searcher
	 * @throws com.mendix.core.CoreException
	 */
	public final globalsearch.proxies.Searcher getFilterResult_Searcher(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		globalsearch.proxies.Searcher result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.FilterResult_Searcher.toString());
		if (identifier != null) {
			result = globalsearch.proxies.Searcher.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of FilterResult_Searcher
	 * @param filterresult_searcher
	 */
	public final void setFilterResult_Searcher(globalsearch.proxies.Searcher filterresult_searcher)
	{
		setFilterResult_Searcher(getContext(), filterresult_searcher);
	}

	/**
	 * Set value of FilterResult_Searcher
	 * @param context
	 * @param filterresult_searcher
	 */
	public final void setFilterResult_Searcher(com.mendix.systemwideinterfaces.core.IContext context, globalsearch.proxies.Searcher filterresult_searcher)
	{
		if (filterresult_searcher == null) {
			getMendixObject().setValue(context, MemberNames.FilterResult_Searcher.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.FilterResult_Searcher.toString(), filterresult_searcher.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return filterResultMendixObject;
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
			final globalsearch.proxies.FilterResult that = (globalsearch.proxies.FilterResult) obj;
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
