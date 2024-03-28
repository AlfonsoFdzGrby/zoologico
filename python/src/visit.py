class Visit:
    def __init__(self, guide, visitors, total_cost, visit_date, num_children, num_adults):
        self._guide = guide
        self._visitors = visitors
        self._total_cost = total_cost
        self._visit_date = visit_date
        self._num_children = num_children
        self._num_adults = num_adults


    def get_guide(self):
        return self._guide

    def set_guide(self, value):
        self._guide = value

    def get_visitors(self):
        return self._visitors

    def set_visitors(self, value):
        self._visitors = value

    def get_total_cost(self):
        return self._total_cost

    def set_total_cost(self, value):
        self._total_cost = value

    def get_visit_date(self):
        return self._visit_date

    def set_visit_date(self, value):
        self._visit_date = value

    def get_num_children(self):
        return self._num_children

    def set_num_children(self, value):
        self._num_children = value

    def get_num_adults(self):
        return self._num_adults

    def set_num_adults(self, value):
        self._num_adults = value