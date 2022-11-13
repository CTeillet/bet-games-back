package com.teillet.betgames.match.dto.pandascore;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"change_type", "id", "modified_at", "object", "type"})
@Generated("jsonschema2pojo")
public class UpdateMatch {

	@JsonProperty("change_type")
	private String changeType;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("modified_at")
	private String modifiedAt;

	@JsonProperty("object")
	private PandaScoreMatch object;

	@JsonProperty("type")
	private String type;

	@JsonProperty("change_type")
	public String getChangeType() {
		return changeType;
	}

	@JsonProperty("change_type")
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("modified_at")
	public String getModifiedAt() {
		return modifiedAt;
	}

	@JsonProperty("modified_at")
	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	@JsonProperty("object")
	public PandaScoreMatch getObject() {
		return object;
	}

	@JsonProperty("object")
	public void setObject(PandaScoreMatch object) {
		this.object = object;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb
				.append(UpdateMatch.class.getName())
				.append('@')
				.append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("changeType");
		sb.append('=');
		sb.append(((this.changeType == null) ? "<null>" : this.changeType));
		sb.append(',');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null) ? "<null>" : this.id));
		sb.append(',');
		sb.append("modifiedAt");
		sb.append('=');
		sb.append(((this.modifiedAt == null) ? "<null>" : this.modifiedAt));
		sb.append(',');
		sb.append("object");
		sb.append('=');
		sb.append(((this.object == null) ? "<null>" : this.object));
		sb.append(',');
		sb.append("type");
		sb.append('=');
		sb.append(((this.type == null) ? "<null>" : this.type));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
		result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
		result =
				(
						(result * 31) +
								((this.modifiedAt == null) ? 0 : this.modifiedAt.hashCode())
				);
		result =
				(
						(result * 31) +
								((this.changeType == null) ? 0 : this.changeType.hashCode())
				);
		result =
				((result * 31) + ((this.object == null) ? 0 : this.object.hashCode()));
		return result;
	}

	@Override
	public boolean equals(java.lang.Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof UpdateMatch) == false) {
			return false;
		}
		UpdateMatch rhs = ((UpdateMatch) other);
		return (
				(
						(
								(
										(
												(this.id == rhs.id) ||
														((this.id != null) && this.id.equals(rhs.id))
										) &&
												(
														(this.type == rhs.type) ||
																((this.type != null) && this.type.equals(rhs.type))
												)
								) &&
										(
												(this.modifiedAt == rhs.modifiedAt) ||
														(
																(this.modifiedAt != null) &&
																		this.modifiedAt.equals(rhs.modifiedAt)
														)
										)
						) &&
								(
										(this.changeType == rhs.changeType) ||
												((this.changeType != null) && this.changeType.equals(rhs.changeType))
								)
				) &&
						(
								(this.object == rhs.object) ||
										((this.object != null) && this.object.equals(rhs.object))
						)
		);
	}
}
