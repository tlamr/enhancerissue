import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class ThickEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Version
	private Long version;

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date createDate;

	@Basic
	private Long createdBy;

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date lastUpdateDate;

	@Basic
	private Long lastUpdateBy;

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date deleteDate;

	@Basic
	private Long deletedBy;

	@Basic
	private boolean isDeleted;

	@Basic
	private BigDecimal d0;
	@Column(length=70)
	private String s0;
	@Column(length=70)
	private String r0;


	@Basic
	private BigDecimal d1;
	@Column(length=70)
	private String s1;
	@Column(length=70)
	private String r1;


	@Basic
	private BigDecimal d2;
	@Column(length=70)
	private String s2;
	@Column(length=70)
	private String r2;


	@Basic
	private BigDecimal d3;
	@Column(length=70)
	private String s3;
	@Column(length=70)
	private String r3;


	@Basic
	private BigDecimal d4;
	@Column(length=70)
	private String s4;
	@Column(length=70)
	private String r4;


	@Basic
	private BigDecimal d5;
	@Column(length=70)
	private String s5;
	@Column(length=70)
	private String r5;


	@Basic
	private BigDecimal d6;
	@Column(length=70)
	private String s6;
	@Column(length=70)
	private String r6;


	@Basic
	private BigDecimal d7;
	@Column(length=70)
	private String s7;
	@Column(length=70)
	private String r7;


	@Basic
	private BigDecimal d8;
	@Column(length=70)
	private String s8;
	@Column(length=70)
	private String r8;


	@Basic
	private BigDecimal d9;
	@Column(length=70)
	private String s9;
	@Column(length=70)
	private String r9;


	@Basic
	private BigDecimal d10;
	@Column(length=70)
	private String s10;
	@Column(length=70)
	private String r10;


	@Basic
	private BigDecimal d11;
	@Column(length=70)
	private String s11;
	@Column(length=70)
	private String r11;


	@Basic
	private BigDecimal d12;
	@Column(length=70)
	private String s12;
	@Column(length=70)
	private String r12;


	@Basic
	private BigDecimal d13;
	@Column(length=70)
	private String s13;
	@Column(length=70)
	private String r13;


	@Basic
	private BigDecimal d14;
	@Column(length=70)
	private String s14;
	@Column(length=70)
	private String r14;


	@Basic
	private BigDecimal d15;
	@Column(length=70)
	private String s15;
	@Column(length=70)
	private String r15;


	@Basic
	private BigDecimal d16;
	@Column(length=70)
	private String s16;
	@Column(length=70)
	private String r16;


	@Basic
	private BigDecimal d17;
	@Column(length=70)
	private String s17;
	@Column(length=70)
	private String r17;


	@Basic
	private BigDecimal d18;
	@Column(length=70)
	private String s18;
	@Column(length=70)
	private String r18;


	@Basic
	private BigDecimal d19;
	@Column(length=70)
	private String s19;
	@Column(length=70)
	private String r19;


	@Basic
	private BigDecimal d20;
	@Column(length=70)
	private String s20;
	@Column(length=70)
	private String r20;


	@Basic
	private BigDecimal d21;
	@Column(length=70)
	private String s21;
	@Column(length=70)
	private String r21;


	@Basic
	private BigDecimal d22;
	@Column(length=70)
	private String s22;
	@Column(length=70)
	private String r22;


	@Basic
	private BigDecimal d23;
	@Column(length=70)
	private String s23;
	@Column(length=70)
	private String r23;


	@Basic
	private BigDecimal d24;
	@Column(length=70)
	private String s24;
	@Column(length=70)
	private String r24;


	@Basic
	private BigDecimal d25;
	@Column(length=70)
	private String s25;
	@Column(length=70)
	private String r25;


	@Basic
	private BigDecimal d26;
	@Column(length=70)
	private String s26;
	@Column(length=70)
	private String r26;


	@Basic
	private BigDecimal d27;
	@Column(length=70)
	private String s27;
	@Column(length=70)
	private String r27;


	@Basic
	private BigDecimal d28;
	@Column(length=70)
	private String s28;
	@Column(length=70)
	private String r28;


	@Basic
	private BigDecimal d29;
	@Column(length=70)
	private String s29;
	@Column(length=70)
	private String r29;


	@Basic
	private BigDecimal d30;
	@Column(length=70)
	private String s30;
	@Column(length=70)
	private String r30;


	@Basic
	private BigDecimal d31;
	@Column(length=70)
	private String s31;
	@Column(length=70)
	private String r31;


	@Basic
	private BigDecimal d32;
	@Column(length=70)
	private String s32;
	@Column(length=70)
	private String r32;


	@Basic
	private BigDecimal d33;
	@Column(length=70)
	private String s33;
	@Column(length=70)
	private String r33;


	@Basic
	private BigDecimal d34;
	@Column(length=70)
	private String s34;
	@Column(length=70)
	private String r34;


	@Basic
	private BigDecimal d35;
	@Column(length=70)
	private String s35;
	@Column(length=70)
	private String r35;


	@Basic
	private BigDecimal d36;
	@Column(length=70)
	private String s36;
	@Column(length=70)
	private String r36;


	@Basic
	private BigDecimal d37;
	@Column(length=70)
	private String s37;
	@Column(length=70)
	private String r37;


	@Basic
	private BigDecimal d38;
	@Column(length=70)
	private String s38;
	@Column(length=70)
	private String r38;


	@Basic
	private BigDecimal d39;
	@Column(length=70)
	private String s39;
	@Column(length=70)
	private String r39;


	@Basic
	private BigDecimal d40;
	@Column(length=70)
	private String s40;
	@Column(length=70)
	private String r40;


	@Basic
	private BigDecimal d41;
	@Column(length=70)
	private String s41;
	@Column(length=70)
	private String r41;


	@Basic
	private BigDecimal d42;
	@Column(length=70)
	private String s42;
	@Column(length=70)
	private String r42;


	@Basic
	private BigDecimal d43;
	@Column(length=70)
	private String s43;
	@Column(length=70)
	private String r43;


	@Basic
	private BigDecimal d44;
	@Column(length=70)
	private String s44;
	@Column(length=70)
	private String r44;


	@Basic
	private BigDecimal d45;
	@Column(length=70)
	private String s45;
	@Column(length=70)
	private String r45;


	@Basic
	private BigDecimal d46;
	@Column(length=70)
	private String s46;
	@Column(length=70)
	private String r46;


	@Basic
	private BigDecimal d47;
	@Column(length=70)
	private String s47;
	@Column(length=70)
	private String r47;


	@Basic
	private BigDecimal d48;
	@Column(length=70)
	private String s48;
	@Column(length=70)
	private String r48;


	@Basic
	private BigDecimal d49;
	@Column(length=70)
	private String s49;
	@Column(length=70)
	private String r49;


	@Basic
	private BigDecimal d50;
	@Column(length=70)
	private String s50;
	@Column(length=70)
	private String r50;


	@Basic
	private BigDecimal d51;
	@Column(length=70)
	private String s51;
	@Column(length=70)
	private String r51;


	@Basic
	private BigDecimal d52;
	@Column(length=70)
	private String s52;
	@Column(length=70)
	private String r52;


	@Basic
	private BigDecimal d53;
	@Column(length=70)
	private String s53;
	@Column(length=70)
	private String r53;


	@Basic
	private BigDecimal d54;
	@Column(length=70)
	private String s54;
	@Column(length=70)
	private String r54;


	@Basic
	private BigDecimal d55;
	@Column(length=70)
	private String s55;
	@Column(length=70)
	private String r55;


	@Basic
	private BigDecimal d56;
	@Column(length=70)
	private String s56;
	@Column(length=70)
	private String r56;


	@Basic
	private BigDecimal d57;
	@Column(length=70)
	private String s57;
	@Column(length=70)
	private String r57;


	@Basic
	private BigDecimal d58;
	@Column(length=70)
	private String s58;
	@Column(length=70)
	private String r58;


	@Basic
	private BigDecimal d59;
	@Column(length=70)
	private String s59;
	@Column(length=70)
	private String r59;


	@Basic
	private BigDecimal d60;
	@Column(length=70)
	private String s60;
	@Column(length=70)
	private String r60;


	@Basic
	private BigDecimal d61;
	@Column(length=70)
	private String s61;
	@Column(length=70)
	private String r61;


	@Basic
	private BigDecimal d62;
	@Column(length=70)
	private String s62;
	@Column(length=70)
	private String r62;


	@Basic
	private BigDecimal d63;
	@Column(length=70)
	private String s63;
	@Column(length=70)
	private String r63;


	@Basic
	private BigDecimal d64;
	@Column(length=70)
	private String s64;
	@Column(length=70)
	private String r64;


	@Basic
	private BigDecimal d65;
	@Column(length=70)
	private String s65;
	@Column(length=70)
	private String r65;


	@Basic
	private BigDecimal d66;
	@Column(length=70)
	private String s66;
	@Column(length=70)
	private String r66;


	@Basic
	private BigDecimal d67;
	@Column(length=70)
	private String s67;
	@Column(length=70)
	private String r67;


	@Basic
	private BigDecimal d68;
	@Column(length=70)
	private String s68;
	@Column(length=70)
	private String r68;


	@Basic
	private BigDecimal d69;
	@Column(length=70)
	private String s69;
	@Column(length=70)
	private String r69;


	@Basic
	private BigDecimal d70;
	@Column(length=70)
	private String s70;
	@Column(length=70)
	private String r70;


	@Basic
	private BigDecimal d71;
	@Column(length=70)
	private String s71;
	@Column(length=70)
	private String r71;


	@Basic
	private BigDecimal d72;
	@Column(length=70)
	private String s72;
	@Column(length=70)
	private String r72;


	@Basic
	private BigDecimal d73;
	@Column(length=70)
	private String s73;
	@Column(length=70)
	private String r73;


	@Basic
	private BigDecimal d74;
	@Column(length=70)
	private String s74;
	@Column(length=70)
	private String r74;


	@Basic
	private BigDecimal d75;
	@Column(length=70)
	private String s75;
	@Column(length=70)
	private String r75;


	@Basic
	private BigDecimal d76;
	@Column(length=70)
	private String s76;
	@Column(length=70)
	private String r76;


	@Basic
	private BigDecimal d77;
	@Column(length=70)
	private String s77;
	@Column(length=70)
	private String r77;


	@Basic
	private BigDecimal d78;
	@Column(length=70)
	private String s78;
	@Column(length=70)
	private String r78;


	@Basic
	private BigDecimal d79;
	@Column(length=70)
	private String s79;
	@Column(length=70)
	private String r79;


	@Basic
	private BigDecimal d80;
	@Column(length=70)
	private String s80;
	@Column(length=70)
	private String r80;


	@Basic
	private BigDecimal d81;
	@Column(length=70)
	private String s81;
	@Column(length=70)
	private String r81;


	@Basic
	private BigDecimal d82;
	@Column(length=70)
	private String s82;
	@Column(length=70)
	private String r82;


	@Basic
	private BigDecimal d83;
	@Column(length=70)
	private String s83;
	@Column(length=70)
	private String r83;


	@Basic
	private BigDecimal d84;
	@Column(length=70)
	private String s84;
	@Column(length=70)
	private String r84;


	@Basic
	private BigDecimal d85;
	@Column(length=70)
	private String s85;
	@Column(length=70)
	private String r85;


	@Basic
	private BigDecimal d86;
	@Column(length=70)
	private String s86;
	@Column(length=70)
	private String r86;


	@Basic
	private BigDecimal d87;
	@Column(length=70)
	private String s87;
	@Column(length=70)
	private String r87;


	@Basic
	private BigDecimal d88;
	@Column(length=70)
	private String s88;
	@Column(length=70)
	private String r88;


	@Basic
	private BigDecimal d89;
	@Column(length=70)
	private String s89;
	@Column(length=70)
	private String r89;


	@Basic
	private BigDecimal d90;
	@Column(length=70)
	private String s90;
	@Column(length=70)
	private String r90;


	@Basic
	private BigDecimal d91;
	@Column(length=70)
	private String s91;
	@Column(length=70)
	private String r91;


	@Basic
	private BigDecimal d92;
	@Column(length=70)
	private String s92;
	@Column(length=70)
	private String r92;


	@Basic
	private BigDecimal d93;
	@Column(length=70)
	private String s93;
	@Column(length=70)
	private String r93;


	@Basic
	private BigDecimal d94;
	@Column(length=70)
	private String s94;
	@Column(length=70)
	private String r94;


	@Basic
	private BigDecimal d95;
	@Column(length=70)
	private String s95;
	@Column(length=70)
	private String r95;


	@Basic
	private BigDecimal d96;
	@Column(length=70)
	private String s96;
	@Column(length=70)
	private String r96;


	@Basic
	private BigDecimal d97;
	@Column(length=70)
	private String s97;
	@Column(length=70)
	private String r97;


	@Basic
	private BigDecimal d98;
	@Column(length=70)
	private String s98;
	@Column(length=70)
	private String r98;


	@Basic
	private BigDecimal d99;
	@Column(length=70)
	private String s99;
	@Column(length=70)
	private String r99;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Long getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(Long lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public Long getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(Long deletedBy) {
		this.deletedBy = deletedBy;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean deleted) {
		isDeleted = deleted;
	}

	public BigDecimal getD0() {
		return d0;
	}

	public void setD0(BigDecimal d0) {
		this.d0 = d0;
	}

	public String getS0() {
		return s0;
	}

	public void setS0(String s0) {
		this.s0 = s0;
	}

	public String getR0() {
		return r0;
	}

	public void setR0(String r0) {
		this.r0 = r0;
	}

	public BigDecimal getD1() {
		return d1;
	}

	public void setD1(BigDecimal d1) {
		this.d1 = d1;
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getR1() {
		return r1;
	}

	public void setR1(String r1) {
		this.r1 = r1;
	}

	public BigDecimal getD2() {
		return d2;
	}

	public void setD2(BigDecimal d2) {
		this.d2 = d2;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public String getR2() {
		return r2;
	}

	public void setR2(String r2) {
		this.r2 = r2;
	}

	public BigDecimal getD3() {
		return d3;
	}

	public void setD3(BigDecimal d3) {
		this.d3 = d3;
	}

	public String getS3() {
		return s3;
	}

	public void setS3(String s3) {
		this.s3 = s3;
	}

	public String getR3() {
		return r3;
	}

	public void setR3(String r3) {
		this.r3 = r3;
	}

	public BigDecimal getD4() {
		return d4;
	}

	public void setD4(BigDecimal d4) {
		this.d4 = d4;
	}

	public String getS4() {
		return s4;
	}

	public void setS4(String s4) {
		this.s4 = s4;
	}

	public String getR4() {
		return r4;
	}

	public void setR4(String r4) {
		this.r4 = r4;
	}

	public BigDecimal getD5() {
		return d5;
	}

	public void setD5(BigDecimal d5) {
		this.d5 = d5;
	}

	public String getS5() {
		return s5;
	}

	public void setS5(String s5) {
		this.s5 = s5;
	}

	public String getR5() {
		return r5;
	}

	public void setR5(String r5) {
		this.r5 = r5;
	}

	public BigDecimal getD6() {
		return d6;
	}

	public void setD6(BigDecimal d6) {
		this.d6 = d6;
	}

	public String getS6() {
		return s6;
	}

	public void setS6(String s6) {
		this.s6 = s6;
	}

	public String getR6() {
		return r6;
	}

	public void setR6(String r6) {
		this.r6 = r6;
	}

	public BigDecimal getD7() {
		return d7;
	}

	public void setD7(BigDecimal d7) {
		this.d7 = d7;
	}

	public String getS7() {
		return s7;
	}

	public void setS7(String s7) {
		this.s7 = s7;
	}

	public String getR7() {
		return r7;
	}

	public void setR7(String r7) {
		this.r7 = r7;
	}

	public BigDecimal getD8() {
		return d8;
	}

	public void setD8(BigDecimal d8) {
		this.d8 = d8;
	}

	public String getS8() {
		return s8;
	}

	public void setS8(String s8) {
		this.s8 = s8;
	}

	public String getR8() {
		return r8;
	}

	public void setR8(String r8) {
		this.r8 = r8;
	}

	public BigDecimal getD9() {
		return d9;
	}

	public void setD9(BigDecimal d9) {
		this.d9 = d9;
	}

	public String getS9() {
		return s9;
	}

	public void setS9(String s9) {
		this.s9 = s9;
	}

	public String getR9() {
		return r9;
	}

	public void setR9(String r9) {
		this.r9 = r9;
	}

	public BigDecimal getD10() {
		return d10;
	}

	public void setD10(BigDecimal d10) {
		this.d10 = d10;
	}

	public String getS10() {
		return s10;
	}

	public void setS10(String s10) {
		this.s10 = s10;
	}

	public String getR10() {
		return r10;
	}

	public void setR10(String r10) {
		this.r10 = r10;
	}

	public BigDecimal getD11() {
		return d11;
	}

	public void setD11(BigDecimal d11) {
		this.d11 = d11;
	}

	public String getS11() {
		return s11;
	}

	public void setS11(String s11) {
		this.s11 = s11;
	}

	public String getR11() {
		return r11;
	}

	public void setR11(String r11) {
		this.r11 = r11;
	}

	public BigDecimal getD12() {
		return d12;
	}

	public void setD12(BigDecimal d12) {
		this.d12 = d12;
	}

	public String getS12() {
		return s12;
	}

	public void setS12(String s12) {
		this.s12 = s12;
	}

	public String getR12() {
		return r12;
	}

	public void setR12(String r12) {
		this.r12 = r12;
	}

	public BigDecimal getD13() {
		return d13;
	}

	public void setD13(BigDecimal d13) {
		this.d13 = d13;
	}

	public String getS13() {
		return s13;
	}

	public void setS13(String s13) {
		this.s13 = s13;
	}

	public String getR13() {
		return r13;
	}

	public void setR13(String r13) {
		this.r13 = r13;
	}

	public BigDecimal getD14() {
		return d14;
	}

	public void setD14(BigDecimal d14) {
		this.d14 = d14;
	}

	public String getS14() {
		return s14;
	}

	public void setS14(String s14) {
		this.s14 = s14;
	}

	public String getR14() {
		return r14;
	}

	public void setR14(String r14) {
		this.r14 = r14;
	}

	public BigDecimal getD15() {
		return d15;
	}

	public void setD15(BigDecimal d15) {
		this.d15 = d15;
	}

	public String getS15() {
		return s15;
	}

	public void setS15(String s15) {
		this.s15 = s15;
	}

	public String getR15() {
		return r15;
	}

	public void setR15(String r15) {
		this.r15 = r15;
	}

	public BigDecimal getD16() {
		return d16;
	}

	public void setD16(BigDecimal d16) {
		this.d16 = d16;
	}

	public String getS16() {
		return s16;
	}

	public void setS16(String s16) {
		this.s16 = s16;
	}

	public String getR16() {
		return r16;
	}

	public void setR16(String r16) {
		this.r16 = r16;
	}

	public BigDecimal getD17() {
		return d17;
	}

	public void setD17(BigDecimal d17) {
		this.d17 = d17;
	}

	public String getS17() {
		return s17;
	}

	public void setS17(String s17) {
		this.s17 = s17;
	}

	public String getR17() {
		return r17;
	}

	public void setR17(String r17) {
		this.r17 = r17;
	}

	public BigDecimal getD18() {
		return d18;
	}

	public void setD18(BigDecimal d18) {
		this.d18 = d18;
	}

	public String getS18() {
		return s18;
	}

	public void setS18(String s18) {
		this.s18 = s18;
	}

	public String getR18() {
		return r18;
	}

	public void setR18(String r18) {
		this.r18 = r18;
	}

	public BigDecimal getD19() {
		return d19;
	}

	public void setD19(BigDecimal d19) {
		this.d19 = d19;
	}

	public String getS19() {
		return s19;
	}

	public void setS19(String s19) {
		this.s19 = s19;
	}

	public String getR19() {
		return r19;
	}

	public void setR19(String r19) {
		this.r19 = r19;
	}

	public BigDecimal getD20() {
		return d20;
	}

	public void setD20(BigDecimal d20) {
		this.d20 = d20;
	}

	public String getS20() {
		return s20;
	}

	public void setS20(String s20) {
		this.s20 = s20;
	}

	public String getR20() {
		return r20;
	}

	public void setR20(String r20) {
		this.r20 = r20;
	}

	public BigDecimal getD21() {
		return d21;
	}

	public void setD21(BigDecimal d21) {
		this.d21 = d21;
	}

	public String getS21() {
		return s21;
	}

	public void setS21(String s21) {
		this.s21 = s21;
	}

	public String getR21() {
		return r21;
	}

	public void setR21(String r21) {
		this.r21 = r21;
	}

	public BigDecimal getD22() {
		return d22;
	}

	public void setD22(BigDecimal d22) {
		this.d22 = d22;
	}

	public String getS22() {
		return s22;
	}

	public void setS22(String s22) {
		this.s22 = s22;
	}

	public String getR22() {
		return r22;
	}

	public void setR22(String r22) {
		this.r22 = r22;
	}

	public BigDecimal getD23() {
		return d23;
	}

	public void setD23(BigDecimal d23) {
		this.d23 = d23;
	}

	public String getS23() {
		return s23;
	}

	public void setS23(String s23) {
		this.s23 = s23;
	}

	public String getR23() {
		return r23;
	}

	public void setR23(String r23) {
		this.r23 = r23;
	}

	public BigDecimal getD24() {
		return d24;
	}

	public void setD24(BigDecimal d24) {
		this.d24 = d24;
	}

	public String getS24() {
		return s24;
	}

	public void setS24(String s24) {
		this.s24 = s24;
	}

	public String getR24() {
		return r24;
	}

	public void setR24(String r24) {
		this.r24 = r24;
	}

	public BigDecimal getD25() {
		return d25;
	}

	public void setD25(BigDecimal d25) {
		this.d25 = d25;
	}

	public String getS25() {
		return s25;
	}

	public void setS25(String s25) {
		this.s25 = s25;
	}

	public String getR25() {
		return r25;
	}

	public void setR25(String r25) {
		this.r25 = r25;
	}

	public BigDecimal getD26() {
		return d26;
	}

	public void setD26(BigDecimal d26) {
		this.d26 = d26;
	}

	public String getS26() {
		return s26;
	}

	public void setS26(String s26) {
		this.s26 = s26;
	}

	public String getR26() {
		return r26;
	}

	public void setR26(String r26) {
		this.r26 = r26;
	}

	public BigDecimal getD27() {
		return d27;
	}

	public void setD27(BigDecimal d27) {
		this.d27 = d27;
	}

	public String getS27() {
		return s27;
	}

	public void setS27(String s27) {
		this.s27 = s27;
	}

	public String getR27() {
		return r27;
	}

	public void setR27(String r27) {
		this.r27 = r27;
	}

	public BigDecimal getD28() {
		return d28;
	}

	public void setD28(BigDecimal d28) {
		this.d28 = d28;
	}

	public String getS28() {
		return s28;
	}

	public void setS28(String s28) {
		this.s28 = s28;
	}

	public String getR28() {
		return r28;
	}

	public void setR28(String r28) {
		this.r28 = r28;
	}

	public BigDecimal getD29() {
		return d29;
	}

	public void setD29(BigDecimal d29) {
		this.d29 = d29;
	}

	public String getS29() {
		return s29;
	}

	public void setS29(String s29) {
		this.s29 = s29;
	}

	public String getR29() {
		return r29;
	}

	public void setR29(String r29) {
		this.r29 = r29;
	}

	public BigDecimal getD30() {
		return d30;
	}

	public void setD30(BigDecimal d30) {
		this.d30 = d30;
	}

	public String getS30() {
		return s30;
	}

	public void setS30(String s30) {
		this.s30 = s30;
	}

	public String getR30() {
		return r30;
	}

	public void setR30(String r30) {
		this.r30 = r30;
	}

	public BigDecimal getD31() {
		return d31;
	}

	public void setD31(BigDecimal d31) {
		this.d31 = d31;
	}

	public String getS31() {
		return s31;
	}

	public void setS31(String s31) {
		this.s31 = s31;
	}

	public String getR31() {
		return r31;
	}

	public void setR31(String r31) {
		this.r31 = r31;
	}

	public BigDecimal getD32() {
		return d32;
	}

	public void setD32(BigDecimal d32) {
		this.d32 = d32;
	}

	public String getS32() {
		return s32;
	}

	public void setS32(String s32) {
		this.s32 = s32;
	}

	public String getR32() {
		return r32;
	}

	public void setR32(String r32) {
		this.r32 = r32;
	}

	public BigDecimal getD33() {
		return d33;
	}

	public void setD33(BigDecimal d33) {
		this.d33 = d33;
	}

	public String getS33() {
		return s33;
	}

	public void setS33(String s33) {
		this.s33 = s33;
	}

	public String getR33() {
		return r33;
	}

	public void setR33(String r33) {
		this.r33 = r33;
	}

	public BigDecimal getD34() {
		return d34;
	}

	public void setD34(BigDecimal d34) {
		this.d34 = d34;
	}

	public String getS34() {
		return s34;
	}

	public void setS34(String s34) {
		this.s34 = s34;
	}

	public String getR34() {
		return r34;
	}

	public void setR34(String r34) {
		this.r34 = r34;
	}

	public BigDecimal getD35() {
		return d35;
	}

	public void setD35(BigDecimal d35) {
		this.d35 = d35;
	}

	public String getS35() {
		return s35;
	}

	public void setS35(String s35) {
		this.s35 = s35;
	}

	public String getR35() {
		return r35;
	}

	public void setR35(String r35) {
		this.r35 = r35;
	}

	public BigDecimal getD36() {
		return d36;
	}

	public void setD36(BigDecimal d36) {
		this.d36 = d36;
	}

	public String getS36() {
		return s36;
	}

	public void setS36(String s36) {
		this.s36 = s36;
	}

	public String getR36() {
		return r36;
	}

	public void setR36(String r36) {
		this.r36 = r36;
	}

	public BigDecimal getD37() {
		return d37;
	}

	public void setD37(BigDecimal d37) {
		this.d37 = d37;
	}

	public String getS37() {
		return s37;
	}

	public void setS37(String s37) {
		this.s37 = s37;
	}

	public String getR37() {
		return r37;
	}

	public void setR37(String r37) {
		this.r37 = r37;
	}

	public BigDecimal getD38() {
		return d38;
	}

	public void setD38(BigDecimal d38) {
		this.d38 = d38;
	}

	public String getS38() {
		return s38;
	}

	public void setS38(String s38) {
		this.s38 = s38;
	}

	public String getR38() {
		return r38;
	}

	public void setR38(String r38) {
		this.r38 = r38;
	}

	public BigDecimal getD39() {
		return d39;
	}

	public void setD39(BigDecimal d39) {
		this.d39 = d39;
	}

	public String getS39() {
		return s39;
	}

	public void setS39(String s39) {
		this.s39 = s39;
	}

	public String getR39() {
		return r39;
	}

	public void setR39(String r39) {
		this.r39 = r39;
	}

	public BigDecimal getD40() {
		return d40;
	}

	public void setD40(BigDecimal d40) {
		this.d40 = d40;
	}

	public String getS40() {
		return s40;
	}

	public void setS40(String s40) {
		this.s40 = s40;
	}

	public String getR40() {
		return r40;
	}

	public void setR40(String r40) {
		this.r40 = r40;
	}

	public BigDecimal getD41() {
		return d41;
	}

	public void setD41(BigDecimal d41) {
		this.d41 = d41;
	}

	public String getS41() {
		return s41;
	}

	public void setS41(String s41) {
		this.s41 = s41;
	}

	public String getR41() {
		return r41;
	}

	public void setR41(String r41) {
		this.r41 = r41;
	}

	public BigDecimal getD42() {
		return d42;
	}

	public void setD42(BigDecimal d42) {
		this.d42 = d42;
	}

	public String getS42() {
		return s42;
	}

	public void setS42(String s42) {
		this.s42 = s42;
	}

	public String getR42() {
		return r42;
	}

	public void setR42(String r42) {
		this.r42 = r42;
	}

	public BigDecimal getD43() {
		return d43;
	}

	public void setD43(BigDecimal d43) {
		this.d43 = d43;
	}

	public String getS43() {
		return s43;
	}

	public void setS43(String s43) {
		this.s43 = s43;
	}

	public String getR43() {
		return r43;
	}

	public void setR43(String r43) {
		this.r43 = r43;
	}

	public BigDecimal getD44() {
		return d44;
	}

	public void setD44(BigDecimal d44) {
		this.d44 = d44;
	}

	public String getS44() {
		return s44;
	}

	public void setS44(String s44) {
		this.s44 = s44;
	}

	public String getR44() {
		return r44;
	}

	public void setR44(String r44) {
		this.r44 = r44;
	}

	public BigDecimal getD45() {
		return d45;
	}

	public void setD45(BigDecimal d45) {
		this.d45 = d45;
	}

	public String getS45() {
		return s45;
	}

	public void setS45(String s45) {
		this.s45 = s45;
	}

	public String getR45() {
		return r45;
	}

	public void setR45(String r45) {
		this.r45 = r45;
	}

	public BigDecimal getD46() {
		return d46;
	}

	public void setD46(BigDecimal d46) {
		this.d46 = d46;
	}

	public String getS46() {
		return s46;
	}

	public void setS46(String s46) {
		this.s46 = s46;
	}

	public String getR46() {
		return r46;
	}

	public void setR46(String r46) {
		this.r46 = r46;
	}

	public BigDecimal getD47() {
		return d47;
	}

	public void setD47(BigDecimal d47) {
		this.d47 = d47;
	}

	public String getS47() {
		return s47;
	}

	public void setS47(String s47) {
		this.s47 = s47;
	}

	public String getR47() {
		return r47;
	}

	public void setR47(String r47) {
		this.r47 = r47;
	}

	public BigDecimal getD48() {
		return d48;
	}

	public void setD48(BigDecimal d48) {
		this.d48 = d48;
	}

	public String getS48() {
		return s48;
	}

	public void setS48(String s48) {
		this.s48 = s48;
	}

	public String getR48() {
		return r48;
	}

	public void setR48(String r48) {
		this.r48 = r48;
	}

	public BigDecimal getD49() {
		return d49;
	}

	public void setD49(BigDecimal d49) {
		this.d49 = d49;
	}

	public String getS49() {
		return s49;
	}

	public void setS49(String s49) {
		this.s49 = s49;
	}

	public String getR49() {
		return r49;
	}

	public void setR49(String r49) {
		this.r49 = r49;
	}

	public BigDecimal getD50() {
		return d50;
	}

	public void setD50(BigDecimal d50) {
		this.d50 = d50;
	}

	public String getS50() {
		return s50;
	}

	public void setS50(String s50) {
		this.s50 = s50;
	}

	public String getR50() {
		return r50;
	}

	public void setR50(String r50) {
		this.r50 = r50;
	}

	public BigDecimal getD51() {
		return d51;
	}

	public void setD51(BigDecimal d51) {
		this.d51 = d51;
	}

	public String getS51() {
		return s51;
	}

	public void setS51(String s51) {
		this.s51 = s51;
	}

	public String getR51() {
		return r51;
	}

	public void setR51(String r51) {
		this.r51 = r51;
	}

	public BigDecimal getD52() {
		return d52;
	}

	public void setD52(BigDecimal d52) {
		this.d52 = d52;
	}

	public String getS52() {
		return s52;
	}

	public void setS52(String s52) {
		this.s52 = s52;
	}

	public String getR52() {
		return r52;
	}

	public void setR52(String r52) {
		this.r52 = r52;
	}

	public BigDecimal getD53() {
		return d53;
	}

	public void setD53(BigDecimal d53) {
		this.d53 = d53;
	}

	public String getS53() {
		return s53;
	}

	public void setS53(String s53) {
		this.s53 = s53;
	}

	public String getR53() {
		return r53;
	}

	public void setR53(String r53) {
		this.r53 = r53;
	}

	public BigDecimal getD54() {
		return d54;
	}

	public void setD54(BigDecimal d54) {
		this.d54 = d54;
	}

	public String getS54() {
		return s54;
	}

	public void setS54(String s54) {
		this.s54 = s54;
	}

	public String getR54() {
		return r54;
	}

	public void setR54(String r54) {
		this.r54 = r54;
	}

	public BigDecimal getD55() {
		return d55;
	}

	public void setD55(BigDecimal d55) {
		this.d55 = d55;
	}

	public String getS55() {
		return s55;
	}

	public void setS55(String s55) {
		this.s55 = s55;
	}

	public String getR55() {
		return r55;
	}

	public void setR55(String r55) {
		this.r55 = r55;
	}

	public BigDecimal getD56() {
		return d56;
	}

	public void setD56(BigDecimal d56) {
		this.d56 = d56;
	}

	public String getS56() {
		return s56;
	}

	public void setS56(String s56) {
		this.s56 = s56;
	}

	public String getR56() {
		return r56;
	}

	public void setR56(String r56) {
		this.r56 = r56;
	}

	public BigDecimal getD57() {
		return d57;
	}

	public void setD57(BigDecimal d57) {
		this.d57 = d57;
	}

	public String getS57() {
		return s57;
	}

	public void setS57(String s57) {
		this.s57 = s57;
	}

	public String getR57() {
		return r57;
	}

	public void setR57(String r57) {
		this.r57 = r57;
	}

	public BigDecimal getD58() {
		return d58;
	}

	public void setD58(BigDecimal d58) {
		this.d58 = d58;
	}

	public String getS58() {
		return s58;
	}

	public void setS58(String s58) {
		this.s58 = s58;
	}

	public String getR58() {
		return r58;
	}

	public void setR58(String r58) {
		this.r58 = r58;
	}

	public BigDecimal getD59() {
		return d59;
	}

	public void setD59(BigDecimal d59) {
		this.d59 = d59;
	}

	public String getS59() {
		return s59;
	}

	public void setS59(String s59) {
		this.s59 = s59;
	}

	public String getR59() {
		return r59;
	}

	public void setR59(String r59) {
		this.r59 = r59;
	}

	public BigDecimal getD60() {
		return d60;
	}

	public void setD60(BigDecimal d60) {
		this.d60 = d60;
	}

	public String getS60() {
		return s60;
	}

	public void setS60(String s60) {
		this.s60 = s60;
	}

	public String getR60() {
		return r60;
	}

	public void setR60(String r60) {
		this.r60 = r60;
	}

	public BigDecimal getD61() {
		return d61;
	}

	public void setD61(BigDecimal d61) {
		this.d61 = d61;
	}

	public String getS61() {
		return s61;
	}

	public void setS61(String s61) {
		this.s61 = s61;
	}

	public String getR61() {
		return r61;
	}

	public void setR61(String r61) {
		this.r61 = r61;
	}

	public BigDecimal getD62() {
		return d62;
	}

	public void setD62(BigDecimal d62) {
		this.d62 = d62;
	}

	public String getS62() {
		return s62;
	}

	public void setS62(String s62) {
		this.s62 = s62;
	}

	public String getR62() {
		return r62;
	}

	public void setR62(String r62) {
		this.r62 = r62;
	}

	public BigDecimal getD63() {
		return d63;
	}

	public void setD63(BigDecimal d63) {
		this.d63 = d63;
	}

	public String getS63() {
		return s63;
	}

	public void setS63(String s63) {
		this.s63 = s63;
	}

	public String getR63() {
		return r63;
	}

	public void setR63(String r63) {
		this.r63 = r63;
	}

	public BigDecimal getD64() {
		return d64;
	}

	public void setD64(BigDecimal d64) {
		this.d64 = d64;
	}

	public String getS64() {
		return s64;
	}

	public void setS64(String s64) {
		this.s64 = s64;
	}

	public String getR64() {
		return r64;
	}

	public void setR64(String r64) {
		this.r64 = r64;
	}

	public BigDecimal getD65() {
		return d65;
	}

	public void setD65(BigDecimal d65) {
		this.d65 = d65;
	}

	public String getS65() {
		return s65;
	}

	public void setS65(String s65) {
		this.s65 = s65;
	}

	public String getR65() {
		return r65;
	}

	public void setR65(String r65) {
		this.r65 = r65;
	}

	public BigDecimal getD66() {
		return d66;
	}

	public void setD66(BigDecimal d66) {
		this.d66 = d66;
	}

	public String getS66() {
		return s66;
	}

	public void setS66(String s66) {
		this.s66 = s66;
	}

	public String getR66() {
		return r66;
	}

	public void setR66(String r66) {
		this.r66 = r66;
	}

	public BigDecimal getD67() {
		return d67;
	}

	public void setD67(BigDecimal d67) {
		this.d67 = d67;
	}

	public String getS67() {
		return s67;
	}

	public void setS67(String s67) {
		this.s67 = s67;
	}

	public String getR67() {
		return r67;
	}

	public void setR67(String r67) {
		this.r67 = r67;
	}

	public BigDecimal getD68() {
		return d68;
	}

	public void setD68(BigDecimal d68) {
		this.d68 = d68;
	}

	public String getS68() {
		return s68;
	}

	public void setS68(String s68) {
		this.s68 = s68;
	}

	public String getR68() {
		return r68;
	}

	public void setR68(String r68) {
		this.r68 = r68;
	}

	public BigDecimal getD69() {
		return d69;
	}

	public void setD69(BigDecimal d69) {
		this.d69 = d69;
	}

	public String getS69() {
		return s69;
	}

	public void setS69(String s69) {
		this.s69 = s69;
	}

	public String getR69() {
		return r69;
	}

	public void setR69(String r69) {
		this.r69 = r69;
	}

	public BigDecimal getD70() {
		return d70;
	}

	public void setD70(BigDecimal d70) {
		this.d70 = d70;
	}

	public String getS70() {
		return s70;
	}

	public void setS70(String s70) {
		this.s70 = s70;
	}

	public String getR70() {
		return r70;
	}

	public void setR70(String r70) {
		this.r70 = r70;
	}

	public BigDecimal getD71() {
		return d71;
	}

	public void setD71(BigDecimal d71) {
		this.d71 = d71;
	}

	public String getS71() {
		return s71;
	}

	public void setS71(String s71) {
		this.s71 = s71;
	}

	public String getR71() {
		return r71;
	}

	public void setR71(String r71) {
		this.r71 = r71;
	}

	public BigDecimal getD72() {
		return d72;
	}

	public void setD72(BigDecimal d72) {
		this.d72 = d72;
	}

	public String getS72() {
		return s72;
	}

	public void setS72(String s72) {
		this.s72 = s72;
	}

	public String getR72() {
		return r72;
	}

	public void setR72(String r72) {
		this.r72 = r72;
	}

	public BigDecimal getD73() {
		return d73;
	}

	public void setD73(BigDecimal d73) {
		this.d73 = d73;
	}

	public String getS73() {
		return s73;
	}

	public void setS73(String s73) {
		this.s73 = s73;
	}

	public String getR73() {
		return r73;
	}

	public void setR73(String r73) {
		this.r73 = r73;
	}

	public BigDecimal getD74() {
		return d74;
	}

	public void setD74(BigDecimal d74) {
		this.d74 = d74;
	}

	public String getS74() {
		return s74;
	}

	public void setS74(String s74) {
		this.s74 = s74;
	}

	public String getR74() {
		return r74;
	}

	public void setR74(String r74) {
		this.r74 = r74;
	}

	public BigDecimal getD75() {
		return d75;
	}

	public void setD75(BigDecimal d75) {
		this.d75 = d75;
	}

	public String getS75() {
		return s75;
	}

	public void setS75(String s75) {
		this.s75 = s75;
	}

	public String getR75() {
		return r75;
	}

	public void setR75(String r75) {
		this.r75 = r75;
	}

	public BigDecimal getD76() {
		return d76;
	}

	public void setD76(BigDecimal d76) {
		this.d76 = d76;
	}

	public String getS76() {
		return s76;
	}

	public void setS76(String s76) {
		this.s76 = s76;
	}

	public String getR76() {
		return r76;
	}

	public void setR76(String r76) {
		this.r76 = r76;
	}

	public BigDecimal getD77() {
		return d77;
	}

	public void setD77(BigDecimal d77) {
		this.d77 = d77;
	}

	public String getS77() {
		return s77;
	}

	public void setS77(String s77) {
		this.s77 = s77;
	}

	public String getR77() {
		return r77;
	}

	public void setR77(String r77) {
		this.r77 = r77;
	}

	public BigDecimal getD78() {
		return d78;
	}

	public void setD78(BigDecimal d78) {
		this.d78 = d78;
	}

	public String getS78() {
		return s78;
	}

	public void setS78(String s78) {
		this.s78 = s78;
	}

	public String getR78() {
		return r78;
	}

	public void setR78(String r78) {
		this.r78 = r78;
	}

	public BigDecimal getD79() {
		return d79;
	}

	public void setD79(BigDecimal d79) {
		this.d79 = d79;
	}

	public String getS79() {
		return s79;
	}

	public void setS79(String s79) {
		this.s79 = s79;
	}

	public String getR79() {
		return r79;
	}

	public void setR79(String r79) {
		this.r79 = r79;
	}

	public BigDecimal getD80() {
		return d80;
	}

	public void setD80(BigDecimal d80) {
		this.d80 = d80;
	}

	public String getS80() {
		return s80;
	}

	public void setS80(String s80) {
		this.s80 = s80;
	}

	public String getR80() {
		return r80;
	}

	public void setR80(String r80) {
		this.r80 = r80;
	}

	public BigDecimal getD81() {
		return d81;
	}

	public void setD81(BigDecimal d81) {
		this.d81 = d81;
	}

	public String getS81() {
		return s81;
	}

	public void setS81(String s81) {
		this.s81 = s81;
	}

	public String getR81() {
		return r81;
	}

	public void setR81(String r81) {
		this.r81 = r81;
	}

	public BigDecimal getD82() {
		return d82;
	}

	public void setD82(BigDecimal d82) {
		this.d82 = d82;
	}

	public String getS82() {
		return s82;
	}

	public void setS82(String s82) {
		this.s82 = s82;
	}

	public String getR82() {
		return r82;
	}

	public void setR82(String r82) {
		this.r82 = r82;
	}

	public BigDecimal getD83() {
		return d83;
	}

	public void setD83(BigDecimal d83) {
		this.d83 = d83;
	}

	public String getS83() {
		return s83;
	}

	public void setS83(String s83) {
		this.s83 = s83;
	}

	public String getR83() {
		return r83;
	}

	public void setR83(String r83) {
		this.r83 = r83;
	}

	public BigDecimal getD84() {
		return d84;
	}

	public void setD84(BigDecimal d84) {
		this.d84 = d84;
	}

	public String getS84() {
		return s84;
	}

	public void setS84(String s84) {
		this.s84 = s84;
	}

	public String getR84() {
		return r84;
	}

	public void setR84(String r84) {
		this.r84 = r84;
	}

	public BigDecimal getD85() {
		return d85;
	}

	public void setD85(BigDecimal d85) {
		this.d85 = d85;
	}

	public String getS85() {
		return s85;
	}

	public void setS85(String s85) {
		this.s85 = s85;
	}

	public String getR85() {
		return r85;
	}

	public void setR85(String r85) {
		this.r85 = r85;
	}

	public BigDecimal getD86() {
		return d86;
	}

	public void setD86(BigDecimal d86) {
		this.d86 = d86;
	}

	public String getS86() {
		return s86;
	}

	public void setS86(String s86) {
		this.s86 = s86;
	}

	public String getR86() {
		return r86;
	}

	public void setR86(String r86) {
		this.r86 = r86;
	}

	public BigDecimal getD87() {
		return d87;
	}

	public void setD87(BigDecimal d87) {
		this.d87 = d87;
	}

	public String getS87() {
		return s87;
	}

	public void setS87(String s87) {
		this.s87 = s87;
	}

	public String getR87() {
		return r87;
	}

	public void setR87(String r87) {
		this.r87 = r87;
	}

	public BigDecimal getD88() {
		return d88;
	}

	public void setD88(BigDecimal d88) {
		this.d88 = d88;
	}

	public String getS88() {
		return s88;
	}

	public void setS88(String s88) {
		this.s88 = s88;
	}

	public String getR88() {
		return r88;
	}

	public void setR88(String r88) {
		this.r88 = r88;
	}

	public BigDecimal getD89() {
		return d89;
	}

	public void setD89(BigDecimal d89) {
		this.d89 = d89;
	}

	public String getS89() {
		return s89;
	}

	public void setS89(String s89) {
		this.s89 = s89;
	}

	public String getR89() {
		return r89;
	}

	public void setR89(String r89) {
		this.r89 = r89;
	}

	public BigDecimal getD90() {
		return d90;
	}

	public void setD90(BigDecimal d90) {
		this.d90 = d90;
	}

	public String getS90() {
		return s90;
	}

	public void setS90(String s90) {
		this.s90 = s90;
	}

	public String getR90() {
		return r90;
	}

	public void setR90(String r90) {
		this.r90 = r90;
	}

	public BigDecimal getD91() {
		return d91;
	}

	public void setD91(BigDecimal d91) {
		this.d91 = d91;
	}

	public String getS91() {
		return s91;
	}

	public void setS91(String s91) {
		this.s91 = s91;
	}

	public String getR91() {
		return r91;
	}

	public void setR91(String r91) {
		this.r91 = r91;
	}

	public BigDecimal getD92() {
		return d92;
	}

	public void setD92(BigDecimal d92) {
		this.d92 = d92;
	}

	public String getS92() {
		return s92;
	}

	public void setS92(String s92) {
		this.s92 = s92;
	}

	public String getR92() {
		return r92;
	}

	public void setR92(String r92) {
		this.r92 = r92;
	}

	public BigDecimal getD93() {
		return d93;
	}

	public void setD93(BigDecimal d93) {
		this.d93 = d93;
	}

	public String getS93() {
		return s93;
	}

	public void setS93(String s93) {
		this.s93 = s93;
	}

	public String getR93() {
		return r93;
	}

	public void setR93(String r93) {
		this.r93 = r93;
	}

	public BigDecimal getD94() {
		return d94;
	}

	public void setD94(BigDecimal d94) {
		this.d94 = d94;
	}

	public String getS94() {
		return s94;
	}

	public void setS94(String s94) {
		this.s94 = s94;
	}

	public String getR94() {
		return r94;
	}

	public void setR94(String r94) {
		this.r94 = r94;
	}

	public BigDecimal getD95() {
		return d95;
	}

	public void setD95(BigDecimal d95) {
		this.d95 = d95;
	}

	public String getS95() {
		return s95;
	}

	public void setS95(String s95) {
		this.s95 = s95;
	}

	public String getR95() {
		return r95;
	}

	public void setR95(String r95) {
		this.r95 = r95;
	}

	public BigDecimal getD96() {
		return d96;
	}

	public void setD96(BigDecimal d96) {
		this.d96 = d96;
	}

	public String getS96() {
		return s96;
	}

	public void setS96(String s96) {
		this.s96 = s96;
	}

	public String getR96() {
		return r96;
	}

	public void setR96(String r96) {
		this.r96 = r96;
	}

	public BigDecimal getD97() {
		return d97;
	}

	public void setD97(BigDecimal d97) {
		this.d97 = d97;
	}

	public String getS97() {
		return s97;
	}

	public void setS97(String s97) {
		this.s97 = s97;
	}

	public String getR97() {
		return r97;
	}

	public void setR97(String r97) {
		this.r97 = r97;
	}

	public BigDecimal getD98() {
		return d98;
	}

	public void setD98(BigDecimal d98) {
		this.d98 = d98;
	}

	public String getS98() {
		return s98;
	}

	public void setS98(String s98) {
		this.s98 = s98;
	}

	public String getR98() {
		return r98;
	}

	public void setR98(String r98) {
		this.r98 = r98;
	}

	public BigDecimal getD99() {
		return d99;
	}

	public void setD99(BigDecimal d99) {
		this.d99 = d99;
	}

	public String getS99() {
		return s99;
	}

	public void setS99(String s99) {
		this.s99 = s99;
	}

	public String getR99() {
		return r99;
	}

	public void setR99(String r99) {
		this.r99 = r99;
	}

}
