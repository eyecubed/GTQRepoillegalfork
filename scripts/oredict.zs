// Remove Wrong Aluminium
<ore:blockAluminum>.remove(<ore:blockAluminum>.firstItem);
<ore:blockAluminum>.remove(<libvulpes:metal0:9>);
<ore:ingotAluminum>.remove(<ore:ingotAluminum>.firstItem);

// Certus Compatability
<ore:crystalCertusQuartz>.add(<metaitem:gemCertusQuartz>);
<ore:gemCertusQuartz>.remove(<ore:gemCertusQuartz>.firstItem);