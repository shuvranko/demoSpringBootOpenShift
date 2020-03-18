package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	    @JsonProperty("pid")
		private long pid;

	    @JsonProperty("fullName")
		private String fullName;

	    @JsonProperty("country")
		private String country;
		
	    @JsonProperty("born")
		private String born;
		
	    @JsonProperty("profile")
		private String profile;

		public User() {
		}

		public long getPid() {
			return pid;
		}

		public void setPid(long pid) {
			this.pid = pid;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getBorn() {
			return born;
		}

		public void setBorn(String born) {
			this.born = born;
		}

		public String getProfile() {
			return profile;
		}

		public void setProfile(String profile) {
			this.profile = profile;
		}

		@Override
		public String toString() {
			return "User [pid=" + pid + ", fullName=" + fullName + ", country=" + country + ", born=" + born
					+ ", profile=" + profile + "]";
		}
		
		
	}