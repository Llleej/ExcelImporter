// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package material_management.proxies;

public class InventoryAudit implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject inventoryAuditMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Material_Management.InventoryAudit";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		No("No"),
		LastAuditDate("LastAuditDate"),
		AuditStock("AuditStock"),
		AuditDescription("AuditDescription"),
		MaterialPartNumber("MaterialPartNumber"),
		IsChecked("IsChecked"),
		Auditor("Auditor"),
		MaterialCode("MaterialCode"),
		InventoryAudit_Stockcounter("Material_Management.InventoryAudit_Stockcounter"),
		InventoryAudit_Material("Material_Management.InventoryAudit_Material");

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

	public InventoryAudit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected InventoryAudit(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject inventoryAuditMendixObject)
	{
		if (inventoryAuditMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, inventoryAuditMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.inventoryAuditMendixObject = inventoryAuditMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static material_management.proxies.InventoryAudit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new material_management.proxies.InventoryAudit(context, mendixObject);
	}

	public static material_management.proxies.InventoryAudit load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return material_management.proxies.InventoryAudit.initialize(context, mendixObject);
	}

	public static java.util.List<material_management.proxies.InventoryAudit> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> material_management.proxies.InventoryAudit.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of No
	 */
	public final java.lang.Long getNo()
	{
		return getNo(getContext());
	}

	/**
	 * @param context
	 * @return value of No
	 */
	public final java.lang.Long getNo(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.No.toString());
	}

	/**
	 * Set value of No
	 * @param no
	 */
	public final void setNo(java.lang.Long no)
	{
		setNo(getContext(), no);
	}

	/**
	 * Set value of No
	 * @param context
	 * @param no
	 */
	public final void setNo(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long no)
	{
		getMendixObject().setValue(context, MemberNames.No.toString(), no);
	}

	/**
	 * @return value of LastAuditDate
	 */
	public final java.util.Date getLastAuditDate()
	{
		return getLastAuditDate(getContext());
	}

	/**
	 * @param context
	 * @return value of LastAuditDate
	 */
	public final java.util.Date getLastAuditDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastAuditDate.toString());
	}

	/**
	 * Set value of LastAuditDate
	 * @param lastauditdate
	 */
	public final void setLastAuditDate(java.util.Date lastauditdate)
	{
		setLastAuditDate(getContext(), lastauditdate);
	}

	/**
	 * Set value of LastAuditDate
	 * @param context
	 * @param lastauditdate
	 */
	public final void setLastAuditDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastauditdate)
	{
		getMendixObject().setValue(context, MemberNames.LastAuditDate.toString(), lastauditdate);
	}

	/**
	 * @return value of AuditStock
	 */
	public final java.math.BigDecimal getAuditStock()
	{
		return getAuditStock(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditStock
	 */
	public final java.math.BigDecimal getAuditStock(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.AuditStock.toString());
	}

	/**
	 * Set value of AuditStock
	 * @param auditstock
	 */
	public final void setAuditStock(java.math.BigDecimal auditstock)
	{
		setAuditStock(getContext(), auditstock);
	}

	/**
	 * Set value of AuditStock
	 * @param context
	 * @param auditstock
	 */
	public final void setAuditStock(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal auditstock)
	{
		getMendixObject().setValue(context, MemberNames.AuditStock.toString(), auditstock);
	}

	/**
	 * @return value of AuditDescription
	 */
	public final java.lang.String getAuditDescription()
	{
		return getAuditDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of AuditDescription
	 */
	public final java.lang.String getAuditDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AuditDescription.toString());
	}

	/**
	 * Set value of AuditDescription
	 * @param auditdescription
	 */
	public final void setAuditDescription(java.lang.String auditdescription)
	{
		setAuditDescription(getContext(), auditdescription);
	}

	/**
	 * Set value of AuditDescription
	 * @param context
	 * @param auditdescription
	 */
	public final void setAuditDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String auditdescription)
	{
		getMendixObject().setValue(context, MemberNames.AuditDescription.toString(), auditdescription);
	}

	/**
	 * @return value of MaterialPartNumber
	 */
	public final java.lang.String getMaterialPartNumber()
	{
		return getMaterialPartNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of MaterialPartNumber
	 */
	public final java.lang.String getMaterialPartNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MaterialPartNumber.toString());
	}

	/**
	 * Set value of MaterialPartNumber
	 * @param materialpartnumber
	 */
	public final void setMaterialPartNumber(java.lang.String materialpartnumber)
	{
		setMaterialPartNumber(getContext(), materialpartnumber);
	}

	/**
	 * Set value of MaterialPartNumber
	 * @param context
	 * @param materialpartnumber
	 */
	public final void setMaterialPartNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String materialpartnumber)
	{
		getMendixObject().setValue(context, MemberNames.MaterialPartNumber.toString(), materialpartnumber);
	}

	/**
	 * @return value of IsChecked
	 */
	public final java.lang.Boolean getIsChecked()
	{
		return getIsChecked(getContext());
	}

	/**
	 * @param context
	 * @return value of IsChecked
	 */
	public final java.lang.Boolean getIsChecked(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsChecked.toString());
	}

	/**
	 * Set value of IsChecked
	 * @param ischecked
	 */
	public final void setIsChecked(java.lang.Boolean ischecked)
	{
		setIsChecked(getContext(), ischecked);
	}

	/**
	 * Set value of IsChecked
	 * @param context
	 * @param ischecked
	 */
	public final void setIsChecked(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean ischecked)
	{
		getMendixObject().setValue(context, MemberNames.IsChecked.toString(), ischecked);
	}

	/**
	 * @return value of Auditor
	 */
	public final java.lang.String getAuditor()
	{
		return getAuditor(getContext());
	}

	/**
	 * @param context
	 * @return value of Auditor
	 */
	public final java.lang.String getAuditor(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Auditor.toString());
	}

	/**
	 * Set value of Auditor
	 * @param auditor
	 */
	public final void setAuditor(java.lang.String auditor)
	{
		setAuditor(getContext(), auditor);
	}

	/**
	 * Set value of Auditor
	 * @param context
	 * @param auditor
	 */
	public final void setAuditor(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String auditor)
	{
		getMendixObject().setValue(context, MemberNames.Auditor.toString(), auditor);
	}

	/**
	 * @return value of MaterialCode
	 */
	public final java.lang.String getMaterialCode()
	{
		return getMaterialCode(getContext());
	}

	/**
	 * @param context
	 * @return value of MaterialCode
	 */
	public final java.lang.String getMaterialCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MaterialCode.toString());
	}

	/**
	 * Set value of MaterialCode
	 * @param materialcode
	 */
	public final void setMaterialCode(java.lang.String materialcode)
	{
		setMaterialCode(getContext(), materialcode);
	}

	/**
	 * Set value of MaterialCode
	 * @param context
	 * @param materialcode
	 */
	public final void setMaterialCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String materialcode)
	{
		getMendixObject().setValue(context, MemberNames.MaterialCode.toString(), materialcode);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of InventoryAudit_Stockcounter
	 */
	public final material_management.proxies.Stockcounter getInventoryAudit_Stockcounter() throws com.mendix.core.CoreException
	{
		return getInventoryAudit_Stockcounter(getContext());
	}

	/**
	 * @param context
	 * @return value of InventoryAudit_Stockcounter
	 * @throws com.mendix.core.CoreException
	 */
	public final material_management.proxies.Stockcounter getInventoryAudit_Stockcounter(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		material_management.proxies.Stockcounter result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InventoryAudit_Stockcounter.toString());
		if (identifier != null) {
			result = material_management.proxies.Stockcounter.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of InventoryAudit_Stockcounter
	 * @param inventoryaudit_stockcounter
	 */
	public final void setInventoryAudit_Stockcounter(material_management.proxies.Stockcounter inventoryaudit_stockcounter)
	{
		setInventoryAudit_Stockcounter(getContext(), inventoryaudit_stockcounter);
	}

	/**
	 * Set value of InventoryAudit_Stockcounter
	 * @param context
	 * @param inventoryaudit_stockcounter
	 */
	public final void setInventoryAudit_Stockcounter(com.mendix.systemwideinterfaces.core.IContext context, material_management.proxies.Stockcounter inventoryaudit_stockcounter)
	{
		if (inventoryaudit_stockcounter == null) {
			getMendixObject().setValue(context, MemberNames.InventoryAudit_Stockcounter.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.InventoryAudit_Stockcounter.toString(), inventoryaudit_stockcounter.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of InventoryAudit_Material
	 */
	public final material_management.proxies.Material getInventoryAudit_Material() throws com.mendix.core.CoreException
	{
		return getInventoryAudit_Material(getContext());
	}

	/**
	 * @param context
	 * @return value of InventoryAudit_Material
	 * @throws com.mendix.core.CoreException
	 */
	public final material_management.proxies.Material getInventoryAudit_Material(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		material_management.proxies.Material result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InventoryAudit_Material.toString());
		if (identifier != null) {
			result = material_management.proxies.Material.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of InventoryAudit_Material
	 * @param inventoryaudit_material
	 */
	public final void setInventoryAudit_Material(material_management.proxies.Material inventoryaudit_material)
	{
		setInventoryAudit_Material(getContext(), inventoryaudit_material);
	}

	/**
	 * Set value of InventoryAudit_Material
	 * @param context
	 * @param inventoryaudit_material
	 */
	public final void setInventoryAudit_Material(com.mendix.systemwideinterfaces.core.IContext context, material_management.proxies.Material inventoryaudit_material)
	{
		if (inventoryaudit_material == null) {
			getMendixObject().setValue(context, MemberNames.InventoryAudit_Material.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.InventoryAudit_Material.toString(), inventoryaudit_material.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return inventoryAuditMendixObject;
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
			final material_management.proxies.InventoryAudit that = (material_management.proxies.InventoryAudit) obj;
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