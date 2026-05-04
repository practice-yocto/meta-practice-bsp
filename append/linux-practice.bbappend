# This bbappend file is used to modify the linux-practice recipe to use the kernel source from the externalsrc layer.
inherit externalsrc

# We want to use the kernel source from the externalsrc layer, so we set EXTERNALSRC to point to it.
EXTERNALSRC = "${COREBASE}/../externalsrc/kernel-source"
