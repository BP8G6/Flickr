package com.xlickr.hibernate.entities;

// Generated Jul 17, 2015 9:25:23 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cascade;

/**
 * FlickrUser generated by hbm2java
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "getFlickerUserByUserName", query = "select o from FlickrUser o where o.userUsername = :username")
	
})
@Table(name = "flickr_user", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "user_username"))
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FlickrUser implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9127796286887897174L;
	private long userId;
	private String userUsername;
	private String userPassword;
	private Date userCreatedDate;
	private Date userUpdatedDate;
	private boolean enabled;
	
	private Set<FlickrImageAccess> flickrImageAccesses = new HashSet<FlickrImageAccess>(
			0);
	private FlickrUserRole flickrUserRoles;
	private Set<FlickrGroupUser> flickrGroupUsers = new HashSet<FlickrGroupUser>(
			0);
	private Set<FlickrImageComments> flickrImageCommentses = new HashSet<FlickrImageComments>(
			0);
	private Set<FlickrFriends> flickrFriendses = new HashSet<FlickrFriends>(0);
	private Set<FlickrFavourites> flickrFavouriteses = new HashSet<FlickrFavourites>(
			0);
	private Set<FlickrImage> flickrImages = new HashSet<FlickrImage>(0);
	private FlickrUserProfile flickrUserProfiles ;
	private Set<FlickrAlbum> flickrAlbums = new HashSet<FlickrAlbum>(0);

	public FlickrUser() {
	}

	public FlickrUser(long userId, String userUsername, String userPassword,
			Date userCreatedDate, Date userUpdatedDate, boolean enabled) {
		this.userId = userId;
		this.userUsername = userUsername;
		this.userPassword = userPassword;
		this.userCreatedDate = userCreatedDate;
		this.userUpdatedDate = userUpdatedDate;
		this.enabled = enabled;
	}

	

	@Id
	@Column(name = "user_id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "user_username", unique = true, nullable = false, length = 50)
	public String getUserUsername() {
		return this.userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	@Column(name = "user_password", nullable = false, length = 3000)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_created_date", nullable = false, length = 29)
	public Date getUserCreatedDate() {
		return this.userCreatedDate;
	}

	public void setUserCreatedDate(Date userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_updated_date", nullable = false, length = 29)
	public Date getUserUpdatedDate() {
		return this.userUpdatedDate;
	}

	public void setUserUpdatedDate(Date userUpdatedDate) {
		this.userUpdatedDate = userUpdatedDate;
	}

	@Column(name = "enabled", nullable = false)
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrUser")
	public Set<FlickrImageAccess> getFlickrImageAccesses() {
		return this.flickrImageAccesses;
	}

	public void setFlickrImageAccesses(
			Set<FlickrImageAccess> flickrImageAccesses) {
		this.flickrImageAccesses = flickrImageAccesses;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "flickrUser",cascade=CascadeType.ALL)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	public FlickrUserRole getFlickrUserRoles() {
		return this.flickrUserRoles;
	}

	public void setFlickrUserRoles(FlickrUserRole flickrUserRoles) {
		this.flickrUserRoles = flickrUserRoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrUser")
	public Set<FlickrGroupUser> getFlickrGroupUsers() {
		return this.flickrGroupUsers;
	}

	public void setFlickrGroupUsers(Set<FlickrGroupUser> flickrGroupUsers) {
		this.flickrGroupUsers = flickrGroupUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrUser")
	public Set<FlickrImageComments> getFlickrImageCommentses() {
		return this.flickrImageCommentses;
	}

	public void setFlickrImageCommentses(
			Set<FlickrImageComments> flickrImageCommentses) {
		this.flickrImageCommentses = flickrImageCommentses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrUser")
	public Set<FlickrFriends> getFlickrFriendses() {
		return this.flickrFriendses;
	}

	public void setFlickrFriendses(Set<FlickrFriends> flickrFriendses) {
		this.flickrFriendses = flickrFriendses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrUser")
	public Set<FlickrFavourites> getFlickrFavouriteses() {
		return this.flickrFavouriteses;
	}

	public void setFlickrFavouriteses(Set<FlickrFavourites> flickrFavouriteses) {
		this.flickrFavouriteses = flickrFavouriteses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrUser")
	public Set<FlickrImage> getFlickrImages() {
		return this.flickrImages;
	}

	public void setFlickrImages(Set<FlickrImage> flickrImages) {
		this.flickrImages = flickrImages;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "flickrUser",cascade=CascadeType.ALL)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	public FlickrUserProfile getFlickrUserProfiles() {
		return this.flickrUserProfiles;
	}

	public void setFlickrUserProfiles(FlickrUserProfile flickrUserProfiles) {
		this.flickrUserProfiles = flickrUserProfiles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "flickrUser")
	public Set<FlickrAlbum> getFlickrAlbums() {
		return this.flickrAlbums;
	}

	public void setFlickrAlbums(Set<FlickrAlbum> flickrAlbums) {
		this.flickrAlbums = flickrAlbums;
	}

}
