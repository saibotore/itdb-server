package de.tgehring.itdb.server.history.entities;

public class HistoryEntity {

	private String timestamp;
	private String editedBy;
	
	public HistoryEntity() {
		
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}
}
