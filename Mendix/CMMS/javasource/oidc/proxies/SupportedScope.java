// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package oidc.proxies;

public class SupportedScope implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject supportedScopeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "OIDC.SupportedScope";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Value("Value"),
		SupportedScope_AutoConfigResponse("OIDC.SupportedScope_AutoConfigResponse");

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

	public SupportedScope(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SupportedScope(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject supportedScopeMendixObject)
	{
		if (supportedScopeMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, supportedScopeMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.supportedScopeMendixObject = supportedScopeMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static oidc.proxies.SupportedScope initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new oidc.proxies.SupportedScope(context, mendixObject);
	}

	public static oidc.proxies.SupportedScope load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return oidc.proxies.SupportedScope.initialize(context, mendixObject);
	}

	/**
	 * @return value of Value
	 */
	public final java.lang.String getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.lang.String getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.lang.String value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of SupportedScope_AutoConfigResponse
	 */
	public final oidc.proxies.AutoConfigResponse getSupportedScope_AutoConfigResponse() throws com.mendix.core.CoreException
	{
		return getSupportedScope_AutoConfigResponse(getContext());
	}

	/**
	 * @param context
	 * @return value of SupportedScope_AutoConfigResponse
	 * @throws com.mendix.core.CoreException
	 */
	public final oidc.proxies.AutoConfigResponse getSupportedScope_AutoConfigResponse(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		oidc.proxies.AutoConfigResponse result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SupportedScope_AutoConfigResponse.toString());
		if (identifier != null) {
			result = oidc.proxies.AutoConfigResponse.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of SupportedScope_AutoConfigResponse
	 * @param supportedscope_autoconfigresponse
	 */
	public final void setSupportedScope_AutoConfigResponse(oidc.proxies.AutoConfigResponse supportedscope_autoconfigresponse)
	{
		setSupportedScope_AutoConfigResponse(getContext(), supportedscope_autoconfigresponse);
	}

	/**
	 * Set value of SupportedScope_AutoConfigResponse
	 * @param context
	 * @param supportedscope_autoconfigresponse
	 */
	public final void setSupportedScope_AutoConfigResponse(com.mendix.systemwideinterfaces.core.IContext context, oidc.proxies.AutoConfigResponse supportedscope_autoconfigresponse)
	{
		if (supportedscope_autoconfigresponse == null) {
			getMendixObject().setValue(context, MemberNames.SupportedScope_AutoConfigResponse.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.SupportedScope_AutoConfigResponse.toString(), supportedscope_autoconfigresponse.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return supportedScopeMendixObject;
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
			final oidc.proxies.SupportedScope that = (oidc.proxies.SupportedScope) obj;
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