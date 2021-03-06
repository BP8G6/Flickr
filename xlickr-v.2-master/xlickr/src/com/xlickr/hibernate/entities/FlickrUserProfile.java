package com.xlickr.hibernate.entities;

// Generated Jul 17, 2015 9:25:23 PM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

/**
 * FlickrUserProfile generated by hbm2java
 */

@Entity
@Table(name = "flickr_user_profile", schema = "public")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class FlickrUserProfile implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3795574350487865493L;
	private long userProfileId;
	private FlickrUser flickrUser;
	private byte[] userProfilePicture;
	private String userProfileFirstName;
	private String userProfileLastName;
	private String userProfileEmail;
	private String userProfilePhoneNumber;
	private Date userProfileCreatedDate;
	private Date userProfileUpdatedDate;
	private String profileImageType;
	
    @Column(name="profile_image_type")
	public String getProfileImageType() {
		return profileImageType;
	}

	public void setProfileImageType(String profileImageType) {
		this.profileImageType = profileImageType;
	}

	public FlickrUserProfile() {
	}

	public FlickrUserProfile(long userProfileId, FlickrUser flickrUser,
			String userProfileFirstName, String userProfileLastName,
			String userProfileEmail, String userProfilePhoneNumber,
			Date userProfileCreatedDate, Date userProfileUpdatedDate) {
		this.userProfileId = userProfileId;
		this.flickrUser = flickrUser;
		this.userProfileFirstName = userProfileFirstName;
		this.userProfileLastName = userProfileLastName;
		this.userProfileEmail = userProfileEmail;
		this.userProfilePhoneNumber = userProfilePhoneNumber;
		this.userProfileCreatedDate = userProfileCreatedDate;
		this.userProfileUpdatedDate = userProfileUpdatedDate;
	}

	public FlickrUserProfile(long userProfileId, FlickrUser flickrUser,
			byte[] userProfilePicture, String userProfileFirstName,
			String userProfileLastName, String userProfileEmail,
			String userProfilePhoneNumber, Date userProfileCreatedDate,
			Date userProfileUpdatedDate) {
		this.userProfileId = userProfileId;
		this.flickrUser = flickrUser;
		this.userProfilePicture = userProfilePicture;
		this.userProfileFirstName = userProfileFirstName;
		this.userProfileLastName = userProfileLastName;
		this.userProfileEmail = userProfileEmail;
		this.userProfilePhoneNumber = userProfilePhoneNumber;
		this.userProfileCreatedDate = userProfileCreatedDate;
		this.userProfileUpdatedDate = userProfileUpdatedDate;
	}

	@Id
	@Column(name = "user_profile_id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getUserProfileId() {
		return this.userProfileId;
	}

	public void setUserProfileId(long userProfileId) {
		this.userProfileId = userProfileId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public FlickrUser getFlickrUser() {
		return this.flickrUser;
	}

	public void setFlickrUser(FlickrUser flickrUser) {
		this.flickrUser = flickrUser;
	}
	@Lob
	@Type(type="org.hibernate.type.BinaryType")
	@Column(name = "user_profile_picture")
	public byte[] getUserProfilePicture() {
		return this.userProfilePicture;
	}

	public void setUserProfilePicture(byte[] userProfilePicture) {
		this.userProfilePicture = userProfilePicture;
	}

	@Column(name = "user_profile_first_name", nullable = false, length = 100)
	public String getUserProfileFirstName() {
		return this.userProfileFirstName;
	}

	public void setUserProfileFirstName(String userProfileFirstName) {
		this.userProfileFirstName = userProfileFirstName;
	}

	@Column(name = "user_profile_last_name", nullable = false, length = 100)
	public String getUserProfileLastName() {
		return this.userProfileLastName;
	}

	public void setUserProfileLastName(String userProfileLastName) {
		this.userProfileLastName = userProfileLastName;
	}

	@Column(name = "user_profile_email", nullable = false, length = 150)
	public String getUserProfileEmail() {
		return this.userProfileEmail;
	}

	public void setUserProfileEmail(String userProfileEmail) {
		this.userProfileEmail = userProfileEmail;
	}

	@Column(name = "user_profile_phone_number", nullable = false, length = 18)
	public String getUserProfilePhoneNumber() {
		return this.userProfilePhoneNumber;
	}

	public void setUserProfilePhoneNumber(String userProfilePhoneNumber) {
		this.userProfilePhoneNumber = userProfilePhoneNumber;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_profile_created_date", nullable = false, length = 29)
	public Date getUserProfileCreatedDate() {
		return this.userProfileCreatedDate;
	}

	public void setUserProfileCreatedDate(Date userProfileCreatedDate) {
		this.userProfileCreatedDate = userProfileCreatedDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_profile_updated_date", nullable = false, length = 29)
	public Date getUserProfileUpdatedDate() {
		return this.userProfileUpdatedDate;
	}

	public void setUserProfileUpdatedDate(Date userProfileUpdatedDate) {
		this.userProfileUpdatedDate = userProfileUpdatedDate;
	}

}
