from user import User


class Visitor(User):
    def __init__(self, name, last_name, birth_date, curp, registration_date):
        super().__init__(name, last_name, birth_date, curp) 
        self.registration_date = registration_date
        self.num_visits = 0
        self.discount_available = False

    def get_registration_date(self):
        return self.registration_date

    def set_registration_date(self, value):
        self.registration_date = value

    def get_num_visits(self):
        return self.num_visits

    def set_num_visits(self, value):
        self.num_visits = value

    def increase_visits(self):
        self.num_visits += 1
        if self.num_visits % 5 == 0:
            self.discount_available = True
            print("Congratulations! You've got a 20% discount on your next visit.")

    def apply_discount(self):
        if self.discount_available:
            self.discount_available = False
            return 0.8  # Apply a 20% discount
        return 1  # No discount

    def get_info(self):
        print(" * Name:", self.name, self.last_name)
        print(" * Birth Date:", self.birth_date.strftime('%d/%m/%Y'))
        print(" * CURP:", self.curp)
        print(" * Registration date:", self.registration_date.strftime('%d/%m/%Y'))
