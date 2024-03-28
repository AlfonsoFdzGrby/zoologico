from person import Person

class Visitor(Person):
    def __init__(self, name, last_name, birth_date, curp, registration_date, num_visits=0):
        super().__init__(name, last_name, birth_date, curp)
        self._registration_date = registration_date
        self._num_visits = num_visits

    
    def get_registration_date(self):
        return self._registration_date

    def set_registration_date(self, value):
        self._registration_date = value

    def get_num_visits(self):
        return self._num_visits

    def set_num_visits(self, value):
        self._num_visits = value
        
    
    def increase_visits(self):
        self.number_of_visits += 1
        if self.number_of_visits % 5 == 0:
            print("Congratulations! You've got a 20% discount on your next visit.")
