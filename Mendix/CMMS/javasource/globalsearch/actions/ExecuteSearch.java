// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package globalsearch.actions;

import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.highlight.Fragmenter;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleSpanFragmenter;
import org.apache.lucene.store.FSDirectory;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import globalsearch.supportfunctions.DirectoryCreator;
import globalsearch.supportfunctions.QueryHelper;
import globalsearch.supportfunctions.SearchHelper;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Use this action to perform a regular search without facets.
 */
public class ExecuteSearch extends CustomJavaAction<java.util.List<IMendixObject>>
{
	/** @deprecated use SearchObject.getMendixObject() instead. */
	@java.lang.Deprecated(forRemoval = true)
	private final IMendixObject __SearchObject;
	private final globalsearch.proxies.Searcher SearchObject;

	public ExecuteSearch(
		IContext context,
		IMendixObject _searchObject
	)
	{
		super(context);
		this.__SearchObject = _searchObject;
		this.SearchObject = _searchObject == null ? null : globalsearch.proxies.Searcher.initialize(getContext(), _searchObject);
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		String searchString = SearchObject.getSearchString();
		
		// Create directory and instantiate reader and seacher.
		FSDirectory indexDir = DirectoryCreator.create();		
		IndexReader reader = DirectoryReader.open(indexDir);
		
		IndexSearcher searcher = new IndexSearcher(reader);
		Query parsedquery = QueryHelper.getQuery(searchString, SearchObject.getSearchType());
		
		// Performing search.
		return SearchHelper.performSearch(SearchObject, searcher, parsedquery, this.getContext());
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ExecuteSearch";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
