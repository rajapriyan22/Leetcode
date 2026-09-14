class Solution(object):
    def fillCups(self, amount):
        time = 0

        while sum(amount) > 0:

            amount.sort()

        
            if amount[2] > 0 and amount[1] > 0:
                amount[2] -= 1
                amount[1] -= 1

            elif amount[2] > 0:
                amount[2] -= 1

            time += 1
        return time
        