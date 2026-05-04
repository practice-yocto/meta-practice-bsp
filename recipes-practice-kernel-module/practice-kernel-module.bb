SUMMARY = "Example of how to build an external linux kernel module"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=c7e03b2484dde1e8b91e76aa5e668f8f"

inherit module

SRC_URI = "\
    file://practice-kernel-module.c \
    file://Makefile \
    file://COPYING \
    "

KERNEL_MODULE_AUTOLOAD += "practice-kernel-module"
S = "${WORKDIR}"
ALLOW_EMPTY_${PN} = "1"
FILESEXTRAPATHS:prepend := "${THISDIR}/file:"
