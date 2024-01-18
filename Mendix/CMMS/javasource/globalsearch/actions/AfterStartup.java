// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package globalsearch.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IDataType;
import com.mendix.webui.CustomJavaAction;
import globalsearch.proxies.SearchableObjectCache;
import globalsearch.supportfunctions.DirectoryCreator;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;

public class AfterStartup extends CustomJavaAction<java.lang.Boolean>
{
	private final java.lang.String Microflow;

	public AfterStartup(
		IContext context,
		java.lang.String _microflow
	)
	{
		super(context);
		this.Microflow = _microflow;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		String paramName = "";
		List<IMendixObject> toPass = new ArrayList<IMendixObject>();
		IMetaObject searchableMain = Core.getMetaObject("GlobalSearch.SearchableObject");
		List<IMetaObject> so = (List<IMetaObject>) searchableMain.getSubObjects();
		for(Entry<String,IDataType> entry : Core.getInputParameters(Microflow).entrySet()) {
			String inputParameterName = entry.getKey();
			paramName = inputParameterName;
			break;
		}
		for(IMetaObject i : so) {
			SearchableObjectCache newCache = new SearchableObjectCache(getContext());
			newCache.setEntityGUID(i.getModelGUID().toString());
			newCache.setEntityName(i.getName());
			toPass.add(newCache.getMendixObject());
		}
		Core.microflowCall(Microflow).withParam(paramName, toPass).execute(getContext());
		
			
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "AfterStartup";
	}

	// BEGIN EXTRA CODE


	// END EXTRA CODE
}
