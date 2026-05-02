KBRANCH:practice = "v5.15/standard/qemuarm64"
KMACHINE:practice = "qemuarm64"
SRCREV_machine:practice = "8634ca1dd87be9b55bd383dc8636b73b82a28051"
COMPATIBLE_MACHINE:practice = "practice"
LINUX_VERSION:practice = "5.15.201"

# fragment configs
SRC_URI += "\
    file://enable_ext3_fs.cfg \
    file://enable_practice.cfg \
    "

# patches
SRC_URI += "\
    file://0001-Add-practice-driver-for-build-system-testing.patch \
    "

# add the path to the kernel config fragments and patches
FILESEXTRAPATHS:prepend := "${THISDIR}/file:"
