USE pharmacy;

INSERT INTO app_user (userRole, name, mobile_no, password, address, status, email, user_name, dob)
VALUES
  ('admin','shanks','123696789','password','dwelling in system','active','admin@example.com','admin','2000-01-01');

INSERT INTO customer (name, mobile_no, address, email)
VALUES
  ('John Doe','9998887770','123 Main St','john@example.com');

INSERT INTO medicines (unique_id, medname, companyname, quantity, amount)
VALUES
  ('MED-001','Paracetamol','Acme Pharma',100,5),
  ('MED-002','Cetirizine','Acme Pharma',50,3);
