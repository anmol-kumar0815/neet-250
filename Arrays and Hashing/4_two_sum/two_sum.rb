class TwoSum
  attr_reader :nums, :target

  def initialize(nums, target)
    @nums = nums
    @target = target
  end

  # o(n^2)
  def brute_force
    for i in 0...nums.length - 1
      for j in i+1...nums.length
        return [i, j] if nums[i] + nums[j] == target
      end
    end

    [-1, -1]
  end

  # Time complexity: O(n), Space complexity: O(n)
  def optimized_solution
    hash = {}

    nums.each_with_index do |num, i|
      required = target - num

      return [hash[required], i] if hash.key?(required)

      hash[num] = i
    end

    [-1, -1]
  end
end

# nums = [2,7,11,15]
# target = 9
# output = [0,1]

# nums = [3,2,4]
# target = 6
# output = [1,2]

nums = [3,3]
target = 6
# output = [0,1]

two_sum = TwoSum.new(nums, target)

puts two_sum.optimized_solution
