// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public enum WorkflowUserTaskState
{
	Created(new java.lang.String[][] { new java.lang.String[] { "en_US", "Created" } }),
	InProgress(new java.lang.String[][] { new java.lang.String[] { "en_US", "In Progress" } }),
	Completed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Completed" } }),
	Paused(new java.lang.String[][] { new java.lang.String[] { "en_US", "Paused" } }),
	Aborted(new java.lang.String[][] { new java.lang.String[] { "en_US", "Aborted" } }),
	Failed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Failed" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private WorkflowUserTaskState(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "ko_KR");
	}

	public java.lang.String getCaption()
	{
		return captions.get("ko_KR");
	}
}
