DESCRIPTION = "Kernel loadable module for Crosslink LVDS-MIPI converter"

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI += "file://crosslink_lvds2mipi.c;subdir=${S}"
SRC_URI += "file://Makefile;subdir=${S}"
SRC_URI += "file://crosslink_cs1_res.sh;subdir=${S}"

inherit module

do_install:append(){
    install -d ${D}${base_bindir}/
    install -m 0755 "${S}/crosslink_cs1_res.sh" "${D}${base_bindir}/crosslink_cs1_res.sh"
}

FILES:${PN} += "${base_bindir}/"