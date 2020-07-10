package com.qianfeng.springbootssm.pojo;


import java.util.Date;

public class MemberUser {

  private long id;
  private String name;
  private String nickname;
  private String password;
  private String passwordSalt;
  private String payPassowrdSalt;
  private String payPassowrd;
  private long userTypeId;
  private long upGroupId;
  private Date upGroupExpires;
  private String safeQuestionJson;
  private String face;
  private String email;
  private String phone;
  private long phoneValid;
  private long emailValid;
  private Date createAt;
  private Date lastLoginAt;
  private Date preLoginAt;
  private String regIp;
  private String lastLoginIp;
  private String preLoginIp;
  private long loginCount;
  private long score;
  private long credit;
  private long isLock;
  private String signature;
  private long loginErrorCount;
  private Date loginErrorAt;
  private long payErrorCount;
  private Date payErrorAt;
  private long recommendBy;
  private long gradeLevel;
  private long provinceId;
  private long cityId;
  private long areaId;
  private String remindJson;
  private String company;
  private String saleNumber;
  private String salePhoto;
  private String realName;
  private long realNameValid;
  private long onsiteValid;
  private String cardNumber;
  private String cardPhoto1;
  private String cardPhoto2;
  private long sex;
  private Date birthday;
  private String address;
  private String remark;
  private String userInfoJson;
  private long userInfoWaitValid;
  private String baseValidJson;
  private String otherHostingId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getPasswordSalt() {
    return passwordSalt;
  }

  public void setPasswordSalt(String passwordSalt) {
    this.passwordSalt = passwordSalt;
  }


  public String getPayPassowrdSalt() {
    return payPassowrdSalt;
  }

  public void setPayPassowrdSalt(String payPassowrdSalt) {
    this.payPassowrdSalt = payPassowrdSalt;
  }


  public String getPayPassowrd() {
    return payPassowrd;
  }

  public void setPayPassowrd(String payPassowrd) {
    this.payPassowrd = payPassowrd;
  }


  public long getUserTypeId() {
    return userTypeId;
  }

  public void setUserTypeId(long userTypeId) {
    this.userTypeId = userTypeId;
  }


  public long getUpGroupId() {
    return upGroupId;
  }

  public void setUpGroupId(long upGroupId) {
    this.upGroupId = upGroupId;
  }


  public Date getUpGroupExpires() {
    return upGroupExpires;
  }

  public void setUpGroupExpires(Date upGroupExpires) {
    this.upGroupExpires = upGroupExpires;
  }


  public String getSafeQuestionJson() {
    return safeQuestionJson;
  }

  public void setSafeQuestionJson(String safeQuestionJson) {
    this.safeQuestionJson = safeQuestionJson;
  }


  public String getFace() {
    return face;
  }

  public void setFace(String face) {
    this.face = face;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public long getPhoneValid() {
    return phoneValid;
  }

  public void setPhoneValid(long phoneValid) {
    this.phoneValid = phoneValid;
  }


  public long getEmailValid() {
    return emailValid;
  }

  public void setEmailValid(long emailValid) {
    this.emailValid = emailValid;
  }


  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }


  public Date getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(Date lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }


  public Date getPreLoginAt() {
    return preLoginAt;
  }

  public void setPreLoginAt(Date preLoginAt) {
    this.preLoginAt = preLoginAt;
  }


  public String getRegIp() {
    return regIp;
  }

  public void setRegIp(String regIp) {
    this.regIp = regIp;
  }


  public String getLastLoginIp() {
    return lastLoginIp;
  }

  public void setLastLoginIp(String lastLoginIp) {
    this.lastLoginIp = lastLoginIp;
  }


  public String getPreLoginIp() {
    return preLoginIp;
  }

  public void setPreLoginIp(String preLoginIp) {
    this.preLoginIp = preLoginIp;
  }


  public long getLoginCount() {
    return loginCount;
  }

  public void setLoginCount(long loginCount) {
    this.loginCount = loginCount;
  }


  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }


  public long getCredit() {
    return credit;
  }

  public void setCredit(long credit) {
    this.credit = credit;
  }


  public long getIsLock() {
    return isLock;
  }

  public void setIsLock(long isLock) {
    this.isLock = isLock;
  }


  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  public long getLoginErrorCount() {
    return loginErrorCount;
  }

  public void setLoginErrorCount(long loginErrorCount) {
    this.loginErrorCount = loginErrorCount;
  }


  public Date getLoginErrorAt() {
    return loginErrorAt;
  }

  public void setLoginErrorAt(Date loginErrorAt) {
    this.loginErrorAt = loginErrorAt;
  }


  public long getPayErrorCount() {
    return payErrorCount;
  }

  public void setPayErrorCount(long payErrorCount) {
    this.payErrorCount = payErrorCount;
  }


  public Date getPayErrorAt() {
    return payErrorAt;
  }

  public void setPayErrorAt(Date payErrorAt) {
    this.payErrorAt = payErrorAt;
  }


  public long getRecommendBy() {
    return recommendBy;
  }

  public void setRecommendBy(long recommendBy) {
    this.recommendBy = recommendBy;
  }


  public long getGradeLevel() {
    return gradeLevel;
  }

  public void setGradeLevel(long gradeLevel) {
    this.gradeLevel = gradeLevel;
  }


  public long getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(long provinceId) {
    this.provinceId = provinceId;
  }


  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public long getAreaId() {
    return areaId;
  }

  public void setAreaId(long areaId) {
    this.areaId = areaId;
  }


  public String getRemindJson() {
    return remindJson;
  }

  public void setRemindJson(String remindJson) {
    this.remindJson = remindJson;
  }


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  public String getSaleNumber() {
    return saleNumber;
  }

  public void setSaleNumber(String saleNumber) {
    this.saleNumber = saleNumber;
  }


  public String getSalePhoto() {
    return salePhoto;
  }

  public void setSalePhoto(String salePhoto) {
    this.salePhoto = salePhoto;
  }


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }


  public long getRealNameValid() {
    return realNameValid;
  }

  public void setRealNameValid(long realNameValid) {
    this.realNameValid = realNameValid;
  }


  public long getOnsiteValid() {
    return onsiteValid;
  }

  public void setOnsiteValid(long onsiteValid) {
    this.onsiteValid = onsiteValid;
  }


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public String getCardPhoto1() {
    return cardPhoto1;
  }

  public void setCardPhoto1(String cardPhoto1) {
    this.cardPhoto1 = cardPhoto1;
  }


  public String getCardPhoto2() {
    return cardPhoto2;
  }

  public void setCardPhoto2(String cardPhoto2) {
    this.cardPhoto2 = cardPhoto2;
  }


  public long getSex() {
    return sex;
  }

  public void setSex(long sex) {
    this.sex = sex;
  }


  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getUserInfoJson() {
    return userInfoJson;
  }

  public void setUserInfoJson(String userInfoJson) {
    this.userInfoJson = userInfoJson;
  }


  public long getUserInfoWaitValid() {
    return userInfoWaitValid;
  }

  public void setUserInfoWaitValid(long userInfoWaitValid) {
    this.userInfoWaitValid = userInfoWaitValid;
  }


  public String getBaseValidJson() {
    return baseValidJson;
  }

  public void setBaseValidJson(String baseValidJson) {
    this.baseValidJson = baseValidJson;
  }


  public String getOtherHostingId() {
    return otherHostingId;
  }

  public void setOtherHostingId(String otherHostingId) {
    this.otherHostingId = otherHostingId;
  }

}
