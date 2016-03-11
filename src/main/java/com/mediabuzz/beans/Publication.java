package com.mediabuzz.beans;
// Generated 11 mars 2016 15:25:13 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Publication generated by hbm2java
 */
@Entity
@Table(name = "publication", catalog = "mediabuzz")
public class Publication implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5306949718673619723L;
	private Integer publicationId;
	private State state;
	private User user;
	private int publicationAlert;
	private Set<Vote> votes = new HashSet<Vote>(0);
	private Set<Tag> tags = new HashSet<Tag>(0);
	private Comment commentByPublicationId;
	private Set<Comment> commentsForPublicationId1 = new HashSet<Comment>(0);
	private Media media;

	public Publication() {
	}

	public Publication(State state, User user, int publicationAlert) {
		this.state = state;
		this.user = user;
		this.publicationAlert = publicationAlert;
	}

	public Publication(State state, User user, int publicationAlert, Set<Vote> votes, Set<Tag> tags,
			Comment commentByPublicationId, Set<Comment> commentsForPublicationId1, Media media) {
		this.state = state;
		this.user = user;
		this.publicationAlert = publicationAlert;
		this.votes = votes;
		this.tags = tags;
		this.commentByPublicationId = commentByPublicationId;
		this.commentsForPublicationId1 = commentsForPublicationId1;
		this.media = media;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "publication_id", unique = true, nullable = false)
	public Integer getPublicationId() {
		return this.publicationId;
	}

	public void setPublicationId(Integer publicationId) {
		this.publicationId = publicationId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id", nullable = false)
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "publication_alert", nullable = false)
	public int getPublicationAlert() {
		return this.publicationAlert;
	}

	public void setPublicationAlert(int publicationAlert) {
		this.publicationAlert = publicationAlert;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "publication")
	public Set<Vote> getVotes() {
		return this.votes;
	}

	public void setVotes(Set<Vote> votes) {
		this.votes = votes;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "publications")
	public Set<Tag> getTags() {
		return this.tags;
	}

	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "publicationByPublicationId")
	public Comment getCommentByPublicationId() {
		return this.commentByPublicationId;
	}

	public void setCommentByPublicationId(Comment commentByPublicationId) {
		this.commentByPublicationId = commentByPublicationId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "publicationByPublicationId1")
	public Set<Comment> getCommentsForPublicationId1() {
		return this.commentsForPublicationId1;
	}

	public void setCommentsForPublicationId1(Set<Comment> commentsForPublicationId1) {
		this.commentsForPublicationId1 = commentsForPublicationId1;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "publication")
	public Media getMedia() {
		return this.media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

}
