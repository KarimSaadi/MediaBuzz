package com.mediabuzz.beans;
// Generated 11 mars 2016 15:25:13 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Media generated by hbm2java
 */
@Entity
@Table(name = "media", catalog = "mediabuzz")
public class Media implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6538118708694778805L;
	private int publicationId;
	private Publication publication;
	private int mediaType;
	private String mediaTitle;
	private String mediaPath;

	public Media() {
	}

	public Media(Publication publication, int mediaType, String mediaTitle, String mediaPath) {
		this.publication = publication;
		this.mediaType = mediaType;
		this.mediaTitle = mediaTitle;
		this.mediaPath = mediaPath;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "publication") )
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "publication_id", unique = true, nullable = false)
	public int getPublicationId() {
		return this.publicationId;
	}

	public void setPublicationId(int publicationId) {
		this.publicationId = publicationId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Publication getPublication() {
		return this.publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	@Column(name = "media_type", nullable = false)
	public int getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(int mediaType) {
		this.mediaType = mediaType;
	}

	@Column(name = "media_title", nullable = false, length = 50)
	public String getMediaTitle() {
		return this.mediaTitle;
	}

	public void setMediaTitle(String mediaTitle) {
		this.mediaTitle = mediaTitle;
	}

	@Column(name = "media_path", nullable = false)
	public String getMediaPath() {
		return this.mediaPath;
	}

	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}

}
