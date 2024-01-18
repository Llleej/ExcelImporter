// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package globalsearch.actions;

import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import communitycommons.ORM;
import globalsearch.supportfunctions.DirectoryCreator;

public class DeleteIndex extends CustomJavaAction<java.lang.Boolean>
{
	private final IMendixObject ObjectToDelete;

	public DeleteIndex(
		IContext context,
		IMendixObject _objectToDelete
	)
	{
		super(context);
		this.ObjectToDelete = _objectToDelete;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		String directory = DirectoryCreator.getDirectory();
		// Instantiate the index writer.
		IndexWriter writer = DirectoryCreator.createWriter(directory);
		
		// Get the GUID of the current object.
		String GUID = ORM.getGUID(ObjectToDelete).toString();
		
		// // Delete index if it already existed.
		long deletedSucces = writer.deleteDocuments(new Term("id", GUID));
	    
		
	    return deletedSucces != -1;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "DeleteIndex";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}