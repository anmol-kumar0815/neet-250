# Simple solution using ".uniq" method
def contains_duplicate(nums)
  nums.uniq.size != nums.size
end

# Set in Ruby
def contains_duplicate(nums)
  set = Set.new
  nums.each do |num|
    return true if set.include?(num)

    set.add(num)
  end

  false
end

puts contains_duplicate([1,2,3,4,5,1])
