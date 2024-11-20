package com.example.amphibians.data

import com.example.amphibians.R

class AmphibiansRepository {
    fun getAmphibians(): List<Amphibian> {
        return listOf(
            Amphibian(
                name = "Great Basin Spadefoot",
                type = "Toad",
                description = "This toad spends most of its life underground. It uses the spades on its back legs to dig down in sandy soils. It comes out in spring to breed.",
                imageResourceId = R.drawable.ic_task_completed
            ),
            Amphibian(
                name = "Tiger Salamander",
                type = "Salamander",
                description = "The Tiger Salamander is one of the largest terrestrial salamanders in North America. They can grow to be 14 inches long!",
                imageResourceId = R.drawable.tiger_salamander
            ),
            Amphibian(
                name = "American Bullfrog",
                type = "Frog",
                description = "The American Bullfrog is a large species of frog native to North America. Known for its deep, resonating croak.",
                imageResourceId = R.drawable.americanbullfrog
            ),
            Amphibian(
                name = "Eastern Newt",
                type = "Newt",
                description = "The Eastern Newt has bright orange juvenile stages called efts, making them easily recognizable in forests.",
                imageResourceId = R.drawable.eastern_newt
            ),
            Amphibian(
                name = "Red-eyed Tree Frog",
                type = "Frog",
                description = "With its iconic red eyes and bright green body, this frog is commonly found in tropical rainforests of Central America.",
                imageResourceId = R.drawable.red_eyed_tree_frog
            ),
            Amphibian(
                name = "Axolotl",
                type = "Salamander",
                description = "Known as the 'walking fish,' this aquatic salamander is native to Mexico and can regenerate its limbs.",
                imageResourceId = R.drawable.axolotl
            ),
            Amphibian(
                name = "Fire-bellied Toad",
                type = "Toad",
                description = "Named for its vibrant orange-red belly, this small toad is found in Asia and Europe.",
                imageResourceId = R.drawable.fire_bellied_toad
            ),
            Amphibian(
                name = "Dart Frog",
                type = "Frog",
                description = "These small frogs are famous for their bright colors and potent toxins, found in the rainforests of Central and South America.",
                imageResourceId = R.drawable.dart_frog
            )
        )
    }
}
