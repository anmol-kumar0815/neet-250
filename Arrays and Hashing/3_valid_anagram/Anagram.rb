class Anagram
  attr_reader :str1, :str2

  def initialize(str1, str2)
    @str1 = str1
    @str2 = str2
  end

  def is_anagram
    return false if str1.length != str2.length

    frequency_hash1 = {}
    frequency_hash2 = {}
    for i in 0...str1.length do
      add_character_entry_to_hash(frequency_hash1, str1[i].to_sym)
      add_character_entry_to_hash(frequency_hash2, str2[i].to_sym)
    end

    frequency_hash1 == frequency_hash2
  end

  # better way
  def is_anagram
    return false if str1.length != str2.length

    frequency_hash1 = Hash.new(0) # if you access a key that does not exists it will always return the default value 0
    frequency_hash2 = Hash.new(0) # Example: puts frequency_hash2[:anmol] => 0

    str1.length.times do |i|
      frequency_hash1[str1[i]] += 1
      frequency_hash2[str2[i]] += 1
    end

    frequency_hash1 == frequency_hash2
  end

  private

    def add_character_entry_to_hash(hash, character)
      if hash.has_key?(character)
        hash[character] += 1
      else
        hash[character] = 1
      end
    end
end

def main
  str1 = gets
  str2 = gets

  a = Anagram.new(str1, str2);

  p a.is_anagram
end

main
