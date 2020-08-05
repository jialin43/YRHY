package cn.edu.nwafu.hjpg.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "RL")
public class Rl {
  @Id
  private String id;
  @Indexed
  private String casNo;
  private String displayName;
  private String lhsxbBhzqyKeyValue;
  private String lhsxbSrjdKeyValue;

  public String getLhsxbBhzqyKeyValue() {
    return lhsxbBhzqyKeyValue;
  }

  public void setLhsxbBhzqyKeyValue(String lhsxbBhzqyKeyValue) {
    this.lhsxbBhzqyKeyValue = lhsxbBhzqyKeyValue;
  }

  public String getLhsxbSrjdKeyValue() {
    return lhsxbSrjdKeyValue;
  }

  public void setLhsxbSrjdKeyValue(String lhsxbSrjdKeyValue) {
    this.lhsxbSrjdKeyValue = lhsxbSrjdKeyValue;
  }

  /**
   * private String hjxwBcfLsInformation;
   * private String hjxwBcfLsKeyValue;
   * private String hjxwBcfSsInformation;
   * private String hjxwBcfSsKeyValue;
   * private String hjxwGjbsqAirKeyValue;
   * private String hjxwGjbsqSoilInformation;
   * private String hjxwGjbsqSoilKeyValue;
   * private String hjxwGjbsqWaterKeyValue;
   * private String hjxwSjbsqInformation;
   * private String hjxwSjbsqKeyValue;
   * private String hjxwSwjjxDuration;
   * private String hjxwSwjjxEndpoint;
   * private String hjxwSwjjxGuideline;
   * private String hjxwSwjjxInterpretation;
   * private String hjxwSwjjxSummary;
   * private String iupacName;
   * private String jkwhFsEndpointconclusionEye;
   * private String jkwhFsEndpointconclusionRespiratory;
   * private String jkwhFsEndpointconclusionSkin;
   * private String jkwhHxzmResults;
   * private String jkwhJkjdEffectlevel;
   * private String jkwhJkjdGuideline;
   * private String jkwhJkjdStrain;
   * private String jkwhJkjdSummary;
   * private String jkwhJkmdCriticaleffectsobserved;
   * private String jkwhJkmdEffectlevel;
   * private String jkwhJkmdGuideline;
   * private String jkwhJkmdQualifier;
   * private String jkwhJkmdSpecies;
   * private String jkwhJkmdStrain;
   * private String jkwhJkmdSummary;
   * private String jkwhJpmdConclusions;
   * private String jkwhJpmdDuration;
   * private String jkwhJpmdGuideline;
   * private String jkwhJpmdLoaellevel;
   * private String jkwhJpmdNoaellevel;
   * private String jkwhJpmdSpecies;
   * private String jkwhJpmdStrain;
   * private String jkwhPfzmResults;
   * private String jkwhSzdxDetail;
   * private String jkwhSzdxEffectlevel;
   * private String jkwhSzdxRoute;
   * private String jkwhSzdxSpecies;
   * private String jkwhSzdxStrain;
   * private String jkwhXrjdEffectlevel;
   * private String jkwhXrjdExpduration;
   * private String jkwhXrjdQualifier;
   * private String jkwhXrjdSpecies;
   * private String jkwhXrjdStrain;
   * private String jkwhXrjdSummary;
   * private String jkwhXrmdCriticaleffectsobserved;
   * private String jkwhXrmdExpduration;
   * private String jkwhXrmdLoecllevel;
   * private String jkwhXrmdNoecllevel;
   * private String jkwhXrmdQualifier;
   * private String jkwhXrmdSpecies;
   * private String jkwhXrmdStrain;
   * private String jkwhXrmdSummary;
   * private String lhsxbBhzqyDiscussion;
   * private String lhsxbBhzqyInformation;
   * private String lhsxbBzxInformation;
   * private String lhsxbBzxKeyValue;
   * private String lhsxbFdInformation;
   * private String lhsxbFdKeyValue;
   * private String lhsxbHlcxKeyValue;
   * private String lhsxbJbxzInformation;
   * private String lhsxbJbxzKeyValue;
   * private String lhsxbKowdszInformation;
   * private String lhsxbKowdszKeyValue;
   * private String lhsxbPhValue;
   * private String lhsxbSdInformation;
   * private String lhsxbSdKeyValue;
   * private String lhsxbSrjdDiscussion;
   * private String lhsxbSrjdInformation;
   * private String lhsxbXdmdDiscussion;
   * private String lhsxbXdmdInformation;
   * private String lhsxbXdmdKeyValue;
   * private String lhsxbYhxInformation;
   * private String lhsxbYhxKeyValue;
   * private String molecularFormula;
   * private String picBase64;
   * private String stwhbBirds;
   * private String stwhbBirdsKeyValue;
   * private String stwhbDqswdxKeyValue;
   * private String stwhbLjdInformation;
   * private String stwhbLjdKeyValue;
   * private String stwhbLtdInformation;
   * private String stwhbLtdKeyValue;
   * private String stwhbLtwdInformation;
   * private String stwhbLtwdKeyValue;
   * private String stwhbLzdInformation;
   * private String stwhbLzdKeyValue;
   * private String stwhbQtlsswdxAnyotherinfo;
   * private String stwhbQtssdxInformation;
   * private String stwhbRemarks;
   * private String stwhbSjdwjdDoseDescriptor;
   * private String stwhbSjdwjdGuideline;
   * private String stwhbSjdwjdTestOrganismsSpecies;
   * private String stwhbSjdwjdTotalExposureDuration;
   * private String stwhbSjdwjdValidityCriteriaFulfilled;
   * private String stwhbSjdwmdDoseDescriptor;
   * private String stwhbSjdwmdExecutiveSummary;
   * private String stwhbSjdwmdGuideline;
   * private String stwhbSjdwmdTestOrganismsSpecies;
   * private String stwhbSjdwmdTotalExposureDuration;
   * private String stwhbSjdwmdValidityCriteriaFulfilled;
   * private String stwhbSswswdxKeyValue;
   * private String stwhbSszwmdEffect;
   * private String stwhbSszwmdEffect_EffectConcentrations1;
   * private String stwhbSszwmdEffect_EffectConcentrations1_Basis_For_Effect;
   * private String stwhbSszwmdEffect_EffectConcentrations1_Conc___Based_On;
   * private String stwhbSszwmdEffect_EffectConcentrations1_DoseDescriptor;
   * private String stwhbSszwmdEffect_EffectConcentrations1_Duration;
   * private String stwhbSszwmdEffect_EffectConcentrations1_Effect_Conc__;
   * private String stwhbSszwmdEffect_EffectConcentrations1_Nominal___Measured;
   * private String stwhbSszwmdEffect_EffectConcentrations1_Remarks;
   * private String stwhbSszwmdEffect_EffectConcentrations2;
   * private String stwhbSszwmdEffect_EffectConcentrations2_Basis_For_Effect;
   * private String stwhbSszwmdEffect_EffectConcentrations2_Conc___Based_On;
   * private String stwhbSszwmdEffect_EffectConcentrations2_DoseDescriptor;
   * private String stwhbSszwmdEffect_EffectConcentrations2_Duration;
   * private String stwhbSszwmdEffect_EffectConcentrations2_Effect_Conc__;
   * private String stwhbSszwmdEffect_EffectConcentrations2_Nominal___Measured;
   * private String stwhbSszwmdEffect_EffectConcentrations2_Remarks;
   * private String stwhbSszwmdEffect_EffectConcentrations3;
   * private String stwhbSszwmdEffect_EffectConcentrations3_Basis_For_Effect;
   * private String stwhbSszwmdEffect_EffectConcentrations3_Conc___Based_On;
   * private String stwhbSszwmdEffect_EffectConcentrations3_DoseDescriptor;
   * private String stwhbSszwmdEffect_EffectConcentrations3_Duration;
   * private String stwhbSszwmdEffect_EffectConcentrations3_Effect_Conc__;
   * private String stwhbSszwmdEffect_EffectConcentrations3_Nominal___Measured;
   * private String stwhbSszwmdEffect_EffectConcentrations3_Remarks;
   * private String stwhbSszwmdEffect_EffectConcentrations4;
   * private String stwhbSszwmdEffect_EffectConcentrations4_Basis_For_Effect;
   * private String stwhbSszwmdEffect_EffectConcentrations4_Conc___Based_On;
   * private String stwhbSszwmdEffect_EffectConcentrations4_DoseDescriptor;
   * private String stwhbSszwmdEffect_EffectConcentrations4_Duration;
   * private String stwhbSszwmdEffect_EffectConcentrations4_Effect_Conc__;
   * private String stwhbSszwmdEffect_EffectConcentrations4_Nominal___Measured;
   * private String stwhbSszwmdEffect_EffectConcentrations4_Remarks;
   * private String stwhbSszwmdEffect_EffectConcentrations5;
   * private String stwhbSszwmdEffect_EffectConcentrations5_Basis_For_Effect;
   * private String stwhbSszwmdEffect_EffectConcentrations5_Conc___Based_On;
   * private String stwhbSszwmdEffect_EffectConcentrations5_DoseDescriptor;
   * private String stwhbSszwmdEffect_EffectConcentrations5_Duration;
   * private String stwhbSszwmdEffect_EffectConcentrations5_Effect_Conc__;
   * private String stwhbSszwmdEffect_EffectConcentrations5_Nominal___Measured;
   * private String stwhbSszwmdEffect_EffectConcentrations5_Remarks;
   * private String stwhbSszwmdEffect_EffectConcentrations6;
   * private String stwhbSszwmdEffect_EffectConcentrations6_Basis_For_Effect;
   * private String stwhbSszwmdEffect_EffectConcentrations6_Conc___Based_On;
   * private String stwhbSszwmdEffect_EffectConcentrations6_DoseDescriptor;
   * private String stwhbSszwmdEffect_EffectConcentrations6_Duration;
   * private String stwhbSszwmdEffect_EffectConcentrations6_Effect_Conc__;
   * private String stwhbSszwmdEffect_EffectConcentrations6_Nominal___Measured;
   * private String stwhbSszwmdEffect_EffectConcentrations6_Remarks;
   * private String stwhbSszwmdEffect_EffectConcentrations7;
   * private String stwhbSszwmdEffect_EffectConcentrations7_Basis_For_Effect;
   * private String stwhbSszwmdEffect_EffectConcentrations7_Conc___Based_On;
   * private String stwhbSszwmdEffect_EffectConcentrations7_DoseDescriptor;
   * private String stwhbSszwmdEffect_EffectConcentrations7_Duration;
   * private String stwhbSszwmdEffect_EffectConcentrations7_Effect_Conc__;
   * private String stwhbSszwmdEffect_EffectConcentrations7_Nominal___Measured;
   * private String stwhbSszwmdEffect_EffectConcentrations7_Remarks;
   * private String stwhbSszwmdEffect_EffectConcentrations8;
   * private String stwhbSszwmdEffect_EffectConcentrations8_Basis_For_Effect;
   * private String stwhbSszwmdEffect_EffectConcentrations8_Conc___Based_On;
   * private String stwhbSszwmdEffect_EffectConcentrations8_DoseDescriptor;
   * private String stwhbSszwmdEffect_EffectConcentrations8_Duration;
   * private String stwhbSszwmdEffect_EffectConcentrations8_Effect_Conc__;
   * private String stwhbSszwmdEffect_EffectConcentrations8_Nominal___Measured;
   * private String stwhbSszwmdEffect_EffectConcentrations8_Remarks;
   * private String stwhbSszwmdExecutiveSummary;
   * private String stwhbSszwmdGuideline;
   * private String stwhbSszwmdTestOrganismsSpecies;
   * private String stwhbSszwmdTotalExposureDuration;
   * private String stwhbYljdConclusions;
   * private String stwhbYljdDoseDescriptor;
   * private String stwhbYljdExecutiveSummary;
   * private String stwhbYljdGuideline;
   * private String stwhbYljdTestOrganismsSpecies;
   * private String stwhbYljdTotalExposureDuration;
   * private String stwhbYljdValidityCriteriaFulfilled;
   * private String stwhbYlmdDoseDescriptor;
   * private String stwhbYlmdExecutiveSummary;
   * private String stwhbYlmdGuideline;
   * private String stwhbYlmdTestOrganismsSpecies;
   * private String stwhbYlmdTotalExposureDuration;
   * private String stwhbYlmdValidityCriteriaFulfilled;
   * private String stwhbYsjdwjdExecutiveSummary;
   * private String stwhbZldxEffect;
   * private String stwhbZldxEffect_EffectConcentrations1;
   * private String stwhbZldxEffect_EffectConcentrations1_Basis_For_Effect;
   * private String stwhbZldxEffect_EffectConcentrations1_Conc___Based_On;
   * private String stwhbZldxEffect_EffectConcentrations1_DoseDescriptor;
   * private String stwhbZldxEffect_EffectConcentrations1_Duration;
   * private String stwhbZldxEffect_EffectConcentrations1_Effect_Conc__;
   * private String stwhbZldxEffect_EffectConcentrations1_Nominal___Measured;
   * private String stwhbZldxEffect_EffectConcentrations1_Remarks_On_Result;
   * private String stwhbZldxEffect_EffectConcentrations2;
   * private String stwhbZldxEffect_EffectConcentrations2_Basis_For_Effect;
   * private String stwhbZldxEffect_EffectConcentrations2_Conc___Based_On;
   * private String stwhbZldxEffect_EffectConcentrations2_DoseDescriptor;
   * private String stwhbZldxEffect_EffectConcentrations2_Duration;
   * private String stwhbZldxEffect_EffectConcentrations2_Effect_Conc__;
   * private String stwhbZldxEffect_EffectConcentrations2_Nominal___Measured;
   * private String stwhbZldxEffect_EffectConcentrations2_Remarks_On_Result;
   * private String stwhbZldxEffect_EffectConcentrations3;
   * private String stwhbZldxEffect_EffectConcentrations3_Basis_For_Effect;
   * private String stwhbZldxEffect_EffectConcentrations3_Conc___Based_On;
   * private String stwhbZldxEffect_EffectConcentrations3_DoseDescriptor;
   * private String stwhbZldxEffect_EffectConcentrations3_Duration;
   * private String stwhbZldxEffect_EffectConcentrations3_Effect_Conc__;
   * private String stwhbZldxEffect_EffectConcentrations3_Nominal___Measured;
   * private String stwhbZldxEffect_EffectConcentrations3_Remarks_On_Result;
   * private String stwhbZldxEffect_EffectConcentrations4;
   * private String stwhbZldxEffect_EffectConcentrations4_Basis_For_Effect;
   * private String stwhbZldxEffect_EffectConcentrations4_Conc___Based_On;
   * private String stwhbZldxEffect_EffectConcentrations4_DoseDescriptor;
   * private String stwhbZldxEffect_EffectConcentrations4_Duration;
   * private String stwhbZldxEffect_EffectConcentrations4_Effect_Conc__;
   * private String stwhbZldxEffect_EffectConcentrations4_Nominal___Measured;
   * private String stwhbZldxEffect_EffectConcentrations4_Remarks_On_Result;
   * private String stwhbZldxExecutiveSummary;
   * private String stwhbZldxPrinciples;
   * private String stwhbZldxTestOrganismsSpecies;
   * private String stwhbZldxTotalExposureDuration;
   * private String stwhbZldxValidityCriteriaFulfilled;
   * private String tradeNames;
   * private String zaxmsInformation;
   **/

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getCasNo() {
    return casNo;
  }

  public void setCasNo(String casNo) {
    this.casNo = casNo;
  }


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

}