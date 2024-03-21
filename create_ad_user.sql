SET aad_auth_validate_oids_in_tenant = OFF;
CREATE AADUSER 'managediduser' IDENTIFIED BY 'd086ccad-e655-488f-90be-fcf006b4301f';
GRANT ALL PRIVILEGES ON defaultdb.* TO 'managediduser'@'%';
FLUSH privileges;
