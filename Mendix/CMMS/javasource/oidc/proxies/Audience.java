// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package oidc.proxies;

public class Audience implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject audienceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "OIDC.Audience";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		aud("aud"),
		Audience_JWT("OIDC.Audience_JWT");

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

	public Audience(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Audience(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject audienceMendixObject)
	{
		if (audienceMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, audienceMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.audienceMendixObject = audienceMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static oidc.proxies.Audience initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new oidc.proxies.Audience(context, mendixObject);
	}

	public static oidc.proxies.Audience load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return oidc.proxies.Audience.initialize(context, mendixObject);
	}

	/**
	 * @return value of aud
	 */
	public final java.lang.String getaud()
	{
		return getaud(getContext());
	}

	/**
	 * @param context
	 * @return value of aud
	 */
	public final java.lang.String getaud(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.aud.toString());
	}

	/**
	 * Set value of aud
	 * @param aud
	 */
	public final void setaud(java.lang.String aud)
	{
		setaud(getContext(), aud);
	}

	/**
	 * Set value of aud
	 * @param context
	 * @param aud
	 */
	public final void setaud(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String aud)
	{
		getMendixObject().setValue(context, MemberNames.aud.toString(), aud);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Audience_JWT
	 */
	public final oidc.proxies.JWT getAudience_JWT() throws com.mendix.core.CoreException
	{
		return getAudience_JWT(getContext());
	}

	/**
	 * @param context
	 * @return value of Audience_JWT
	 * @throws com.mendix.core.CoreException
	 */
	public final oidc.proxies.JWT getAudience_JWT(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		oidc.proxies.JWT result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Audience_JWT.toString());
		if (identifier != null) {
			result = oidc.proxies.JWT.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Audience_JWT
	 * @param audience_jwt
	 */
	public final void setAudience_JWT(oidc.proxies.JWT audience_jwt)
	{
		setAudience_JWT(getContext(), audience_jwt);
	}

	/**
	 * Set value of Audience_JWT
	 * @param context
	 * @param audience_jwt
	 */
	public final void setAudience_JWT(com.mendix.systemwideinterfaces.core.IContext context, oidc.proxies.JWT audience_jwt)
	{
		if (audience_jwt == null) {
			getMendixObject().setValue(context, MemberNames.Audience_JWT.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Audience_JWT.toString(), audience_jwt.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return audienceMendixObject;
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
			final oidc.proxies.Audience that = (oidc.proxies.Audience) obj;
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