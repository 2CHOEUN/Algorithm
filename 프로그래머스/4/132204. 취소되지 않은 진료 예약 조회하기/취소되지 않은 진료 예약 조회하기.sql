select 
    ap.APNT_NO,
    pt.PT_NAME,
    pt.PT_NO,
    dr.MCDP_CD,
    dr.DR_NAME, 
    ap.APNT_YMD
 from 
    APPOINTMENT ap, DOCTOR dr, PATIENT pt
 where  ap.PT_NO  = pt.PT_NO and
        ap.MDDR_ID = dr.DR_ID and
        to_char(ap.APNT_YMD,'yyyy-mm-dd') = '2022-04-13' and
        ap.APNT_CNCL_YN = 'N'
 order by APNT_YMD asc