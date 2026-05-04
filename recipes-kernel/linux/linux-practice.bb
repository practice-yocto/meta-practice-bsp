DESCRIPTION = "Linux kernel from kernel.org git repository"
SECTION = "kernel"
LICENSE = "GPLv2"

inherit kernel
inherit kernel-yocto

# branch, name, tag and nocheckout are passed to git fetcher
SRC_URI = "git://github.com/practice-yocto/linux.git;protocol=https;branch=v5.15/dev"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

# SRCREV is the commit hash to fetch. It can be overridden by the user when building the image, e.g.:
# SRCREV = "8bb7eca972ad531c9b149c0a51ab43a417385813"
SRCREV = "${AUTOREV}"

# defconfig file to be used for the kernel build
SRC_URI += "file://defconfig "

# SCC
SRC_URI += "\
    file://practice-kernel.scc \
    "

# fragment configs
# SRC_URI += "\
#     file://enable_ext3_fs.cfg \
#     file://enable_practice.cfg \
#     "

# patches
# SRC_URI += "\
#     file://0001-Add-practice-driver-for-build-system-testing.patch \
#     "

LINUX_VERSION ?= "5.15"
LINUX_VERSION_EXTENSION ?= "-practice"

# SRCPV: ${GIT_COMMIT} truncated to 7 characters
PROVIDES += "virtual/kernel"
PV = "${LINUX_VERSION}+git${SRCPV}"
COMPATIBLE_MACHINE = "practice"

FILESEXTRAPATHS:prepend := "${THISDIR}/file:"
